
public interface atmInterface {
	public String balanceInquiry();
	public void withdraw(double x);
	public void deposit(double x);
	public String next();
	public String previous();
	public boolean login(String x, String y);

}
