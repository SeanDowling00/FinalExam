package FinalExamTest;

/* Name: Sean Dowling
 * StudentID: C00246571
 * Course: Cybercrime And IT Security
 * Year: 2
 */

import java.util.Objects;

//Part C

public class Accounts {

	ElectricityAccount[] accounts = new ElectricityAccount[10];
	int accountCount = 0;
	
	public Accounts() {}
	
	public void addAccount(ElectricityAccount theAccount)
	{
		accounts[accountCount]= theAccount;
		accountCount++;
	}
	
	public ElectricityAccount[] getOver1000()
	{
		int count = 0;
		int step = 0;
		
		for (int i = 0;i < accounts.length; i++)
		{
			if(!Objects.isNull(accounts[i]))
			{
				if(accounts[i].calculateCharges()>1000)
				{
					count++;
				}
			}
		}
		ElectricityAccount[] over1000 = new ElectricityAccount[count];
		for(int i = 0; i < accounts.length; i++)
		{
			if(!Objects.isNull(accounts[i]))
			{
				if(accounts[i].calculateCharges()>1000)
				{
					over1000[step]= accounts[i];
					step++;
				}
			}
		}
		
		return over1000;
		
	}
	
}
