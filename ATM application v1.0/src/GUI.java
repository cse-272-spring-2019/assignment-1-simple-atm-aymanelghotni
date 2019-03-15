import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class GUI {

	private JFrame frmAtmbyaymanloginPage;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmAtmbyaymanloginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAtmbyaymanloginPage = new JFrame();
		frmAtmbyaymanloginPage.getContentPane().setBackground(UIManager.getColor("Tree.selectionBackground"));
		frmAtmbyaymanloginPage.setTitle("ATMByAyman/Login Page");
		frmAtmbyaymanloginPage.setBounds(100, 100, 450, 369);
		frmAtmbyaymanloginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAtmbyaymanloginPage.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(149, 121, 173, 201);
		frmAtmbyaymanloginPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0:passwordField.setText(null);btnNewButton_1.setVisible(false);break;
				case 1:passwordField_1.setText(null);--clientNo.i;break;
				case 2:passwordField_2.setText(null);--clientNo.i;break;
				case 3:passwordField_3.setText(null);--clientNo.i;panel.setVisible(true);break;
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(24, 196, 85, 40);
		frmAtmbyaymanloginPage.getContentPane().add(btnNewButton_1);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCardNumber.setBounds(24, 33, 119, 40);
		frmAtmbyaymanloginPage.getContentPane().add(lblCardNumber);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPin.setBounds(24, 83, 119, 40);
		frmAtmbyaymanloginPage.getContentPane().add(lblPin);
		
		textField = new JTextField();
		textField.setBounds(176, 33, 157, 32);
		frmAtmbyaymanloginPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setEditable(false);
		passwordField.setBounds(176, 83, 32, 32);
		frmAtmbyaymanloginPage.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField_1.setBackground(new Color(255, 255, 255));
		passwordField_1.setEditable(false);
		passwordField_1.setBounds(217, 83, 32, 32);
		frmAtmbyaymanloginPage.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField_2.setBackground(new Color(255, 255, 255));
		passwordField_2.setEditable(false);
		passwordField_2.setBounds(259, 83, 32, 32);
		frmAtmbyaymanloginPage.getContentPane().add(passwordField_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField_3.setBackground(new Color(255, 255, 255));
		passwordField_3.setEditable(false);
		passwordField_3.setBounds(301, 83, 32, 32);
		frmAtmbyaymanloginPage.getContentPane().add(passwordField_3);
		
		
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("0");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("0");clientNo.i++;break;
				case 2: passwordField_2.setText("0");clientNo.i++;break;
				case 3: passwordField_3.setText("0");break;

			}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_8.setBounds(57, 154, 45, 37);
		panel.add(button_8);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("8");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("8");clientNo.i++;break;
				case 2: passwordField_2.setText("8");clientNo.i++;break;
				case 3: passwordField_3.setText("8");panel.setVisible(false);break;

			}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBounds(57, 107, 45, 37);
		panel.add(button);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("7");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("7");clientNo.i++;break;
				case 2: passwordField_2.setText("7");clientNo.i++;break;
				case 3: passwordField_3.setText("7");panel.setVisible(false);break;

			}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBounds(2, 107, 45, 37);
		panel.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("9");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("9");clientNo.i++;break;
				case 2: passwordField_2.setText("9");clientNo.i++;break;
				case 3: passwordField_3.setText("9");panel.setVisible(false);break;

			}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBounds(112, 107, 45, 37);
		panel.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("6");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("6");clientNo.i++;break;
				case 2: passwordField_2.setText("6");clientNo.i++;break;
				case 3: passwordField_3.setText("6");panel.setVisible(false);break;

			}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBounds(112, 60, 45, 37);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("5");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("5");clientNo.i++;break;
				case 2: passwordField_2.setText("5");clientNo.i++;break;
				case 3: passwordField_3.setText("5");panel.setVisible(false);break;

			}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_4.setBounds(57, 60, 45, 37);
		panel.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("4");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("4");clientNo.i++;break;
				case 2: passwordField_2.setText("4");clientNo.i++;break;
				case 3: passwordField_3.setText("4");panel.setVisible(false);break;

			}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_5.setBounds(2, 60, 45, 37);
		panel.add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("1");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("1");clientNo.i++;break;
				case 2: passwordField_2.setText("1");clientNo.i++;break;
				case 3: passwordField_3.setText("1");panel.setVisible(false);break;

			}
		}});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_6.setBounds(2, 13, 45, 37);
		panel.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("2");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("2");clientNo.i++;break;
				case 2: passwordField_2.setText("2");clientNo.i++;break;
				case 3: passwordField_3.setText("2");panel.setVisible(false);break;

			}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_7.setBounds(57, 13, 45, 37);
		panel.add(button_7);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.i) {
				case 0: passwordField.setText("3");clientNo.i++;btnNewButton_1.setVisible(true);break;
				case 1:	passwordField_1.setText("3");clientNo.i++;break;
				case 2: passwordField_2.setText("3");clientNo.i++;break;
				case 3: passwordField_3.setText("3");panel.setVisible(false);break;

			}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_9.setBounds(112, 13, 45, 37);
		panel.add(button_9);
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clientNo.user.login(textField.getText(), passwordField.getText().concat(passwordField_1.getText().concat(passwordField_2.getText().concat(passwordField_3.getText())))))
				{
					frmAtmbyaymanloginPage.setVisible(false);
					GUI2.main(null);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(341, 196, 85, 40);
		frmAtmbyaymanloginPage.getContentPane().add(btnLogin);
	}

}
