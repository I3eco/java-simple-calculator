package simpleCalculator;

import java.text.DecimalFormat;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator {
	private boolean checkAction;
	private JTextArea textArea;
	private JTextField textField;
	private String[] splittedItems;
	private double sumArea;

	public Calculator() {
		this.checkAction = false;
		this.textArea = new JTextArea();
		this.textField = new JTextField();
		this.sumArea = 0;
	}

	public boolean isCheckAction() {
		return checkAction;
	}

	public void setCheckAction(boolean checkAction) {
		this.checkAction = checkAction;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public String getSplitItem(int index) {
		if (index < 0 || index >= this.splittedItems.length) {
			return null;
		}
		return this.splittedItems[index];
	}

	public String[] getSplittedItems() {
		return this.splittedItems;
	}

	public static boolean isTextFieldEmpty(JTextField textField) {
		if (textField.getText().equals("")) {
			return true;
		}
		return false;
	}

	public static boolean canPressOpBtn(JTextField textField, boolean checkAction) {
		if (isTextFieldEmpty(textField)) {
			return false;
		}

		if (checkAction) {
			return false;
		}
		return true;
	}

	public void pressNumBtn(JTextField textField, String btnWrite, boolean checkAction) {
		if (checkAction) {
			textField.setText("");
		}
		textField.setText(textField.getText() + btnWrite);
		this.checkAction = false;
	}

	public void setTextArea(JTextArea textArea, JTextField textField, char operation) {
		if (textArea.getText().toString().equals("")) {
			this.textArea.setText(textField.getText() + " " + operation);
		} else {
			this.textArea.setText(textArea.getText() + " " + textField.getText() + " " + operation);
		}
	}

	public void clearTextArea() {
		this.textArea.setText("");
	}

	public void splitTextArea() {
		this.splittedItems = this.textArea.getText().toString().split(" ");
	}

	public String calculate() {
		DecimalFormat format = new DecimalFormat("0.################");
		this.splitTextArea();
		this.sumArea = Double.valueOf(splittedItems[0]);
		for (int i = 0; i < this.splittedItems.length - 1; i++) {
			if (splittedItems[i].equals("+")) {
				this.sumArea += Double.valueOf(this.splittedItems[i + 1]);
			}
			if (splittedItems[i].equals("-")) {
				this.sumArea -= Double.valueOf(this.splittedItems[i + 1]);
			}
			if (splittedItems[i].equals("*")) {
				this.sumArea *= Double.valueOf(this.splittedItems[i + 1]);
			}
			if (splittedItems[i].equals("\u00F7")) {
				if (Double.valueOf(this.splittedItems[i + 1]) == 0) {
					String a = null;
					return a;
				}
				this.sumArea /= Double.valueOf(this.splittedItems[i + 1]);
			}
		}
		return format.format(this.sumArea);
	}

	public String equal() {
		DecimalFormat format = new DecimalFormat("0.################");
		this.splitTextArea();
		if (splittedItems[splittedItems.length - 1].equals("+")) {
			this.calculate();
			if (!this.getTextField().getText().equals("")) {
				this.sumArea += Double.valueOf(this.getTextField().getText());
			}
		}
		if (splittedItems[splittedItems.length - 1].equals("-")) {
			this.calculate();
			if (!this.getTextField().getText().equals("")) {
				this.sumArea -= Double.valueOf(this.getTextField().getText());
			}
		}
		if (splittedItems[splittedItems.length - 1].equals("*")) {
			this.calculate();
			if (!this.getTextField().getText().equals("")) {
				this.sumArea *= Double.valueOf(this.getTextField().getText());
			}
		}
		if (splittedItems[splittedItems.length - 1].equals("\u00F7")) {
			this.calculate();
			if (!this.getTextField().getText().equals("")) {
				if (Double.valueOf(this.getTextField().getText()) == 0) {
					String a = null;
					return a;
				}
				this.sumArea /= Double.valueOf(this.getTextField().getText());
			}
		}
		return format.format(this.sumArea);
	}

	public void clearSumArea() {
		this.sumArea = 0;
	}

	public void negate() {
		DecimalFormat format = new DecimalFormat("0.################");
		String a = this.textField.getText();
		Double b = -Double.valueOf(a.replaceAll(",", "."));
		a = format.format(b);
		this.textField.setText(a.replaceAll(",", "."));
	}

	public void delLastFieldChar() {
		if (this.textField.getText() != null && this.textField.getText().length() > 0) {
			this.textField.setText(this.textField.getText().substring(0, this.textField.getText().length() - 1));
		}
	}

}
