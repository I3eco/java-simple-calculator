package simpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class WCalculator {

	private JFrame frame;
	Calculator calculator = new Calculator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WCalculator window = new WCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 340, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		calculator.setTextArea(new JTextArea());
		calculator.getTextArea().getGraphics();
		calculator.getTextArea().setLineWrap(true);
		calculator.getTextArea().setEditable(false);
		calculator.getTextArea().setFont(new Font("Tahoma", Font.BOLD, 15));
		calculator.getTextArea().setForeground(new Color(128, 128, 128));
		calculator.getTextArea().setBackground(UIManager.getColor("InternalFrame.resizeIconHighlight"));
		calculator.getTextArea().setBounds(12, 13, 307, 102);
		frame.getContentPane().add(calculator.getTextArea());

		calculator.setTextField(new JTextField());
		calculator.getTextField().setEditable(false);
		calculator.getTextField().setHorizontalAlignment(SwingConstants.RIGHT);
		calculator.getTextField().setFont(new Font("Tahoma", Font.BOLD, 20));
		calculator.getTextField().setBackground(new Color(128, 128, 128));
		calculator.getTextField().setForeground(new Color(211, 211, 211));
		calculator.getTextField().setBounds(12, 117, 307, 40);
		frame.getContentPane().add(calculator.getTextField());
		calculator.getTextField().setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(128, 128, 128));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setForeground(new Color(211, 211, 211));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "1", calculator.isCheckAction());
			}
		});
		btn1.setBounds(12, 320, 72, 45);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(128, 128, 128));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "2", calculator.isCheckAction());
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setForeground(new Color(211, 211, 211));
		btn2.setBounds(86, 320, 72, 45);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(128, 128, 128));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "3", calculator.isCheckAction());
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setForeground(new Color(211, 211, 211));
		btn3.setBounds(160, 320, 72, 45);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(128, 128, 128));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "4", calculator.isCheckAction());
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setForeground(new Color(211, 211, 211));
		btn4.setBounds(12, 274, 72, 45);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(128, 128, 128));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "5", calculator.isCheckAction());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setForeground(new Color(211, 211, 211));
		btn5.setBounds(86, 274, 72, 45);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(128, 128, 128));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "6", calculator.isCheckAction());
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setForeground(new Color(211, 211, 211));
		btn6.setBounds(160, 274, 72, 45);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(128, 128, 128));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "7", calculator.isCheckAction());
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setForeground(new Color(211, 211, 211));
		btn7.setBounds(12, 228, 72, 45);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(128, 128, 128));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "8", calculator.isCheckAction());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setForeground(new Color(211, 211, 211));
		btn8.setBounds(86, 228, 72, 45);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(128, 128, 128));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "9", calculator.isCheckAction());
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setForeground(new Color(211, 211, 211));
		btn9.setBounds(160, 228, 72, 45);
		frame.getContentPane().add(btn9);

		JButton btnPoint = new JButton(".");
		btnPoint.setBackground(new Color(128, 128, 128));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dot = calculator.getTextField().getText();
				if (dot.indexOf('.') < 0) {
					calculator.pressNumBtn(calculator.getTextField(), ".", calculator.isCheckAction());
				}
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoint.setForeground(new Color(211, 211, 211));
		btnPoint.setBounds(160, 367, 72, 45);
		frame.getContentPane().add(btnPoint);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(128, 128, 128));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.pressNumBtn(calculator.getTextField(), "0", calculator.isCheckAction());
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setForeground(new Color(211, 211, 211));
		btn0.setBounds(86, 367, 72, 45);
		frame.getContentPane().add(btn0);

		JButton btnPosNeg = new JButton("+ -");
		btnPosNeg.setBackground(new Color(128, 128, 128));
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.negate();
			}
		});
		btnPosNeg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPosNeg.setForeground(new Color(211, 211, 211));
		btnPosNeg.setBounds(12, 367, 72, 45);
		frame.getContentPane().add(btnPosNeg);

		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(128, 128, 128));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.canPressOpBtn(calculator.getTextField(), calculator.isCheckAction())) {
					calculator.setTextArea(calculator.getTextArea(), calculator.getTextField(), '+');
					calculator.getTextField().setText(calculator.calculate());
					calculator.setCheckAction(true);
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setForeground(new Color(211, 211, 211));
		btnAdd.setBounds(247, 228, 72, 45);
		frame.getContentPane().add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(128, 128, 128));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.canPressOpBtn(calculator.getTextField(), calculator.isCheckAction())) {
					calculator.setTextArea(calculator.getTextArea(), calculator.getTextField(), '-');
					calculator.getTextField().setText(calculator.calculate());
					calculator.setCheckAction(true);
				}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setForeground(new Color(211, 211, 211));
		btnSub.setBounds(247, 274, 72, 45);
		frame.getContentPane().add(btnSub);

		JButton btnMulti = new JButton("*");
		btnMulti.setBackground(new Color(128, 128, 128));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.canPressOpBtn(calculator.getTextField(), calculator.isCheckAction())) {
					calculator.setTextArea(calculator.getTextArea(), calculator.getTextField(), '*');
					calculator.getTextField().setText(calculator.calculate());
					calculator.setCheckAction(true);
				}
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMulti.setForeground(new Color(211, 211, 211));
		btnMulti.setBounds(247, 320, 72, 45);
		frame.getContentPane().add(btnMulti);

		JButton btnDiv = new JButton("\u00F7");
		btnDiv.setBackground(new Color(128, 128, 128));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Calculator.canPressOpBtn(calculator.getTextField(), calculator.isCheckAction())) {
					calculator.setTextArea(calculator.getTextArea(), calculator.getTextField(), '\u00F7');
					if (calculator.calculate() == null) {
						calculator.getTextField().setText("Cannot divide by zero");
					} else {
						calculator.getTextField().setText(calculator.calculate());
					}
					calculator.setCheckAction(true);
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setForeground(new Color(211, 211, 211));
		btnDiv.setBounds(247, 367, 72, 45);
		frame.getContentPane().add(btnDiv);

		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(128, 128, 128));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calculator.equal() == null) {
					calculator.getTextField().setText("Cannot divide by zero");
				} else {
					calculator.getTextField().setText(calculator.equal());
				}
				calculator.clearTextArea();
				calculator.setCheckAction(true);
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setForeground(new Color(211, 211, 211));
		btnEqual.setBounds(247, 170, 72, 45);
		frame.getContentPane().add(btnEqual);

		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(128, 128, 128));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.getTextArea().setText("");
				calculator.getTextField().setText("");
				calculator.clearSumArea();
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setForeground(new Color(211, 211, 211));
		btnC.setBounds(86, 170, 72, 45);
		frame.getContentPane().add(btnC);

		JButton btnCE = new JButton("CE");
		btnCE.setBackground(new Color(128, 128, 128));
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.getTextField().setText("");
			}
		});
		btnCE.setForeground(new Color(211, 211, 211));
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCE.setBounds(12, 170, 72, 45);
		frame.getContentPane().add(btnCE);

		JButton buttonDel = new JButton("<x");
		buttonDel.setBackground(new Color(128, 128, 128));
		buttonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!calculator.isCheckAction()) {
					calculator.delLastFieldChar();
				}
			}
		});
		buttonDel.setForeground(new Color(211, 211, 211));
		buttonDel.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonDel.setBounds(160, 170, 72, 45);
		frame.getContentPane().add(buttonDel);

		JLabel lblNewLabel = new JLabel("Simple Calculator by VGV");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 412, 334, 26);
		frame.getContentPane().add(lblNewLabel);

	}
}
