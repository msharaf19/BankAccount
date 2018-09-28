
public class BankAccount 
{
	// Fields

	double balance;
	String name;
	int accNum;
	
	
	
	// Constructors 
	
	public BankAccount(String name, int accNum) 
	{
		balance = 0.0;
	}
	
	public BankAccount(String name, int accNum, double balance1) 
	{
		balance = balance1;
	}
	
	// Methods 
	
	public void deposit(double deposit) 
	{
		balance = balance + deposit;
	}
	
	public void withdraw(double withdraw) 
	{
		balance = balance - withdraw;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public String toString() 
	{
		return "balance: " + balance + "\naccount number: " + accNum + "\nname: " + name;
	
		
	}
}
