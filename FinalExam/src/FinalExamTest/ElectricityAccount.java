package FinalExamTest;

/* Name: Sean Dowling
 * StudentID: C00246571
 * Course: Cybercrime And IT Security
 * Year: 2
 */

// Part A

public class ElectricityAccount extends Account {
	
	
	double hourlyRate;
	int hrs;
	
	public ElectricityAccount(String accountNumber, double hourlyRate, int hrs)
	{
		super(accountNumber);
		this.hourlyRate = hourlyRate;
		this.hrs = hrs;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	
	public double calculateCharges()
	{
		return hourlyRate * hrs;
	}
	
	@Override
	public String toString()
	{
		return "Account: " + getAccountNumber() + ", Hourly Rate: " + getHourlyRate() + ", Hrs used: " + getHrs(); 
	}
	
	

}
