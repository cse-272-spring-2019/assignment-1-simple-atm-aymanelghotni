import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.UIManager;

public class GUI2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI2() {
		setTitle("ATMbyAyman/TransactionsPage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(10, 93, 416, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JButton button = new JButton("$50");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(50);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(50);panel.setVisible(false);break;
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(10, 10, 85, 21);
		panel.add(button);
		
		JButton button_2 = new JButton("$100");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(100);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(100);panel.setVisible(false);break;
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBounds(10, 41, 85, 21);
		panel.add(button_2);
		
		JButton button_3 = new JButton("$200");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(200);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(200);panel.setVisible(false);break;
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.setBounds(10, 72, 85, 21);
		panel.add(button_3);
		
		JButton button_4 = new JButton("$500");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(500);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(500);panel.setVisible(false);break;
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_4.setBounds(10, 103, 85, 21);
		panel.add(button_4);
		
		JButton button_5 = new JButton("$1000");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(1000);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(1000);panel.setVisible(false);break;
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_5.setBounds(321, 10, 85, 21);
		panel.add(button_5);
		
		JButton button_6 = new JButton("$2000");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(2000);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(2000);panel.setVisible(false);break;
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.setBounds(321, 41, 85, 21);
		panel.add(button_6);
		
		JButton button_7 = new JButton("$3000");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(3000);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(3000);panel.setVisible(false);break;
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_7.setBounds(321, 72, 85, 21);
		panel.add(button_7);
		
		JButton button_8 = new JButton("$5000");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(clientNo.operation)
				{
				case 0: clientNo.user.withdraw(5000);panel.setVisible(false);break;
				case 1: clientNo.user.deposit(5000);panel.setVisible(false);break;
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_8.setBounds(321, 103, 85, 21);
		panel.add(button_8);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(164, 112, 85, 21);
		panel.add(btnBack);
		
		Label label = new Label("");
		label.setForeground(UIManager.getColor("Label.foreground"));
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		label.setAlignment(Label.CENTER);
		label.setBackground(UIManager.getColor("ToolBar.highlight"));
		label.setBounds(10, 22, 416, 65);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientNo.operation=0;
				panel.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 103, 127, 46);
		contentPane.add(btnNewButton);
		
		JButton btnInquiry = new JButton("Inquiry");
		btnInquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Your balance is $"+clientNo.user.balanceInquiry());
			}
		});
		btnInquiry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInquiry.setBounds(147, 103, 142, 46);
		contentPane.add(btnInquiry);
		
		JButton button_1 = new JButton("<Previous");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(clientNo.user.previous());
			}
		});
		button_1.setBounds(10, 232, 95, 21);
		contentPane.add(button_1);
		
		JButton btnNext = new JButton("Next>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(clientNo.user.next());
			}
		});
		btnNext.setBounds(331, 232, 95, 21);
		contentPane.add(btnNext);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientNo.operation=1;
				panel.setVisible(true);
			}
		});
		btnDeposit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeposit.setBounds(299, 103, 127, 46);
		contentPane.add(btnDeposit);
	}
}
