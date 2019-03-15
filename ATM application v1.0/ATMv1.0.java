import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	Database a=new Database();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public MainMenu() {
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x=textField.getText();
				double money=Double.parseDouble(x);
				a.db[clientNo.number].withdraw(money);
			}
		});
		btnWithdraw.setBounds(10, 24, 121, 21);
		contentPane.add(btnWithdraw);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String y=textField_1.getText();
				double x=Double.parseDouble(y);
				a.db[clientNo.number].deposit(x);
			}
		});
		btnDeposit.setBounds(10, 79, 121, 21);
		contentPane.add(btnDeposit);
		
		JButton btnBalanceInquiry = new JButton("Balance inquiry");
		btnBalanceInquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x=a.db[clientNo.number].getBalance();
				String y="Your balance is $"+String.valueOf(x);
				textField_2.setText(y);
			}
		});
		btnBalanceInquiry.setBounds(10, 145, 133, 21);
		contentPane.add(btnBalanceInquiry);
		
		textField = new JTextField();
		textField.setBounds(207, 25, 144, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 80, 144, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 124, 200, 116);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("< Previous");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=a.db[clientNo.number].displayHistory(clientNo.historyNo);
				clientNo.historyNo--;
				if(clientNo.historyNo<0) {
					clientNo.historyNo=0;
					JOptionPane.showMessageDialog(null, "You reached your latest transaction");
					return;
				}
				textField_2.setText(s);
				
			}
		});
		button.setBounds(10, 232, 85, 21);
		contentPane.add(button);
		
		JButton btnNext = new JButton("Next >");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s=a.db[clientNo.number].displayHistory(clientNo.historyNo);
				clientNo.historyNo++;
				if(clientNo.historyNo>4)
				{
					JOptionPane.showMessageDialog(null, "You reached your earliest transaction");
					clientNo.historyNo=4;
					return;
				}
				textField_2.setText(s);
			}
		});
		btnNext.setBounds(105, 232, 85, 21);
		contentPane.add(btnNext);
	}
}
