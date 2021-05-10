package FinalExamTest;

/* Name: Sean Dowling
 * StudentID: C00246571
 * Course: Cybercrime And IT Security
 * Year: 2
 */

public class Run{
	
	public static void main(String[] args)
	{
		Accounts accounts = new Accounts();
		ElectricityAccount acc1 = new ElectricityAccount("01",20,100);
		ElectricityAccount acc2 = new ElectricityAccount("02",20,200);
		ElectricityAccount acc3 = new ElectricityAccount("03",20,300);
		
		System.out.println("Processing Accounts...");
		processAccount(acc1);
		processAccount(acc2);
		processAccount(acc3);
		System.out.println();
		
		//Part D
		
		
		System.out.println("Accounts with over 1000");
		accounts.addAccount(acc1);
		accounts.addAccount(acc2);
		accounts.addAccount(acc3);
		ElectricityAccount[] over1000 = accounts.getOver1000();
		
		for(int i = 0; i < over1000.length; i++)
		{
			processAccount(over1000[i]);
		}
	}
	
	//Part B
	
	public static void processAccount(ElectricityAccount theAccount)
	{
		System.out.println("Account Details : " + theAccount);
		System.out.println("Total: " + theAccount.calculateCharges());
	}

}
