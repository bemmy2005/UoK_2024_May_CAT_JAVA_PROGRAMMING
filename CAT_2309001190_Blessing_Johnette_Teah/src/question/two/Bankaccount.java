package question.two;

public class Bankaccount {
	private double balance;
	private String accountName;
	
	//Constructor
	public Bankaccount() {
		super();
		this.balance = 0.0;
		this.accountName = "";
	}
	public Bankaccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public Bankaccount(double balance, String accountName) {
		super();
		this.balance = balance;
		this.accountName = accountName;
	}
	//getters and setters
	public double getBalance() {
		return balance;
	}
	public void setBalance(String st) {
		this.balance = balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance +=amount;
	}
	
	public void deposit(String str) {
		this.balance += balance ;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void withdraw(String str) {
		this.balance -= balance;
	}

	
	
	
	

}
