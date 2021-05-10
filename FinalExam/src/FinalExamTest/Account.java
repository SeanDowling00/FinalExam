package FinalExamTest;

/* Name: Sean Dowling
 * StudentID: C00246571
 * Course: Cybercrime And IT Security
 * Year: 2
 */

public abstract class Account {
	
	private String accountNumber;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + "]";
	}

	
}
