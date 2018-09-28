
public class MainBankAccount 
{

	public static void main(String[] args) 
	{
		String mae = "mae";
		
		
		BankAccount account1 = new BankAccount(mae, 25);
		BankAccount account2 = new BankAccount(mae, 36, 132.50);
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
		account2.deposit(32.0);
		
		System.out.println(account2.getBalance());
		
		account2.withdraw(54.3);
		
		System.out.println(account2.getBalance());
		
		System.out.println(account2.toString());

	}

}
