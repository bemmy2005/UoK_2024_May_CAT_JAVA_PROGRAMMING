//Nhial Luka Deng-239000417

package question_Two;

public class BankAccount {

	private double balance;
	private String accountName;

	// Constructors
	public BankAccount() {
		balance = 0.0;
		setAccountName(" ");
	}

	public BankAccount(double initialBalance, String name) {
		balance = initialBalance;
		setAccountName(name);
	}

	public BankAccount(double initialBalance) {
		balance = initialBalance;
		setAccountName(" ");
	}

	// Methods
	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void deposit(String str) {
		balance = balance + Double.parseDouble(str);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void withdraw(String str) {
		balance = balance - Double.parseDouble(str);
	}

	public void setBalance(double b) {
		balance = b;
	}

	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}

