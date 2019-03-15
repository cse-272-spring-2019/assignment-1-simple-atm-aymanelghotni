import javax.swing.JOptionPane;

public class Account implements atmInterface {
	//vars
	private String cardNum;
	private String password;
	private double balance;
	public String[] history=new String[5];
	//getters
	public String getCardNum ()
	{
		return cardNum;
	}
	public String getPassword()
	{
		return password;
	}
	public double getBalance()
	{
		return balance;
	}
	//setters
	public void setCardNum(String x)
	{
		cardNum=x;
	}
	
	void setPassword(String y)
	{

			password=y;
			
	}
	public void setBalance(double x)
	{
		balance=x;
	}
	//constructors
 	Account (String x, String y, double b)
	{
		cardNum=x;password=y;balance=b;
	}
	Account()
	{
		cardNum="0";
		password="0";
		balance=0;
		
	}
	
	//Methods
	public void withdraw(double x)
	{
		
		if(balance<x) {
			JOptionPane.showMessageDialog(null,"Invalid operation: Insufficient amount in your balance");
		}
		else
		{
			balance=balance-x;
			int i;
			for(i=4;i>0;i--)
			{
				history[i]=history[i-1];
			}
			history[0]="withdrawn $"+x;
			JOptionPane.showMessageDialog(null, "Successfully withdrawn $"+x+". Your new balance is $"+balance);
			clientNo.historyNo=0;
		}
			
	}
	public void deposit(double x)
	{
		balance=balance+x;
		int i;
		for(i=4;i>0;i--)
		{
			history[i]=history[i-1];
		}
		history[0]="deposited $"+x;
		clientNo.historyNo=0;
		JOptionPane.showMessageDialog(null, "Successfully deposited $"+x+". Your new balance is $"+balance);
	}
	public String balanceInquiry()
	{
		int i;
		for(i=4;i>0;i--)
		{
			history[i]=history[i-1];
		}
		history[0]="Inquiry $"+balance;
		return Double.toString(balance);
	}
	public String previous()
	{
		clientNo.historyNo++;
		if(clientNo.historyNo>4)
		{
			JOptionPane.showMessageDialog(null, "You reached your earliest transaction");
			clientNo.historyNo=4;
		}
		return history[clientNo.historyNo];
		
	}
	public String next()
	{
		clientNo.historyNo--;
		if(clientNo.historyNo<0)
		{
			JOptionPane.showMessageDialog(null, "You reached your latest transaction");
			clientNo.historyNo=0;
		}
		return history[clientNo.historyNo];
	}
	public boolean login(String x, String y)
	{
			if(x.equals(cardNum)&&y.equals(password))
			{
				JOptionPane.showMessageDialog(null, "Successfully logged in");
				return true;
			}
			JOptionPane.showMessageDialog(null, "Invalid credentials");
			return false;
	}
		
}

