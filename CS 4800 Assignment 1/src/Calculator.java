import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private String display = "";
	private float val2 = 0;
	private char operator = '_'; // _ = null operator

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 400, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// display box
		JPanel panel = new JPanel();
		panel.setBounds(38, 25, 310, 70);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("0"); // display box
		lblNewLabel.setBounds(10, 0, 290, 70);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 48));

		JButton btnNewButton = new JButton("0");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.equals("0")) {
					display += "0";
					lblNewLabel.setText(display);
				}
			}
		});
		btnNewButton.setBounds(38, 430, 70, 70);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("."); // dot
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.contains(".")) {
					display += ".";
					lblNewLabel.setText(display);
				}
			}
		});
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1.setBounds(118, 430, 70, 70);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("="); // equals
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doOperation();
				operator = '=';
				lblNewLabel.setText("" + val2);
				display = String.valueOf(val2);
			}
		});
		btnNewButton_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1.setBounds(198, 430, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("1"); // 1
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "1";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1.setBounds(38, 349, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1);

		JButton btnNewButton_1_1_1_1 = new JButton("2"); // 2
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "2";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1.setBounds(118, 349, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1 = new JButton("3"); // 3
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "3";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1.setBounds(198, 349, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1 = new JButton("4"); // 4
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "4";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1.setBounds(38, 268, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("5"); // 5
		btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "5";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1.setBounds(118, 268, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_1_1 = new JButton("6"); // 6
		btnNewButton_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "6";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1.setBounds(198, 268, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_1_1_1 = new JButton("+"); // add
		btnNewButton_1_1_1_1_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == '_' || operator == '=') {
					if (display.isEmpty()) {
						val2 = 0;
					} else {
						val2 = Float.valueOf(display);
					}
					display = "";
				} else {
					doOperation();
					lblNewLabel.setText("" + val2);
					display = "";
				}
				operator = '+';
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1_1.setBounds(278, 349, 70, 151);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_1_1_2 = new JButton("-"); // subtract
		btnNewButton_1_1_1_1_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == '_' || operator == '=') {
					if (display.isEmpty()) {
						val2 = 0;
					} else {
						val2 = Float.valueOf(display);
					}
					display = "";
				} else {
					doOperation();
					lblNewLabel.setText("" + val2);
					display = "";
				}
				operator = '-';
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1_2.setBounds(278, 268, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1_2);

		JButton btnNewButton_1_1_1_1_1_1_1_1_2_1 = new JButton("\u00D7"); // multiply
		btnNewButton_1_1_1_1_1_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == '_' || operator == '=') {
					if (display.isEmpty()) {
						val2 = 0;
					} else {
						val2 = Float.valueOf(display);
					}
					display = "";
				} else {
					doOperation();
					lblNewLabel.setText("" + val2);
					display = "";
				}
				operator = '*';
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_2_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1_2_1.setBounds(278, 187, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1_2_1);

		JButton btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1 = new JButton("CLEAR"); // clear
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1.setBackground(Color.PINK);
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = "";
				val2 = 0;
				operator = '_';
				lblNewLabel.setText("0");
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1.setBounds(38, 106, 230, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1_2_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_2 = new JButton("7"); // 7
		btnNewButton_1_1_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "7";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1_1_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_2.setBounds(38, 187, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_2);

		JButton btnNewButton_1_1_1_1_1_1_1_2 = new JButton("8"); // 8
		btnNewButton_1_1_1_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "8";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1_1_1_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_2.setBounds(118, 187, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_2);

		JButton btnNewButton_1_1_1_1_1_1_1_1_3 = new JButton("9"); // 9
		btnNewButton_1_1_1_1_1_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display += "9";
				lblNewLabel.setText(display);
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_3.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_1_3.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1_3.setBounds(198, 187, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1_3);

		JButton btnNewButton_1_1_1_1_1_1_1_1_2_1_1 = new JButton("\u00F7"); // divide
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == '_' || operator == '=') {
					if (display.isEmpty()) {
						val2 = 0;
					} else {
						val2 = Float.valueOf(display);
					}
					display = "";
				} else {
					doOperation();
					lblNewLabel.setText("" + val2);
					display = "";
				}
				operator = '/';
			}
		});
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		btnNewButton_1_1_1_1_1_1_1_1_2_1_1.setBounds(278, 106, 70, 70);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1_1_2_1_1);

	}

	public void doOperation() {
		switch (operator) {
		case '+': // add
			val2 = val2 + Float.valueOf(display);
			break;
		case '-': // subtract
			val2 = val2 - Float.valueOf(display);
			break;
		case '*': // multiply
			val2 = val2 * Float.valueOf(display);
			break;
		case '/': // divide
			val2 = val2 / Float.valueOf(display);
			break;
		}
	}
}
