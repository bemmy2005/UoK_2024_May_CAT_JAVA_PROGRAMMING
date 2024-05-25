//Nhial Luka Deng-239000417

package question_Two;

public class TestBankAccount {

	public static void main(String[] args) {
		
		// Create a BankAccount object with an initial balance and account name
		BankAccount wallet = new BankAccount(100.0 , "Nhial");

		// Display the initial balance
		System.out.println("Initial Balance: $" + wallet.getBalance());

		// Deposit some amounts
		wallet.deposit(300.0);
		wallet.deposit(500.0);

		// Display the balance after deposits
		System.out.println("Balance after deposits: $" + wallet.getBalance());

		// Withdraw some amounts
		wallet.withdraw(150.0);
		wallet.withdraw(350.0);

		// Display the balance after withdrawals
		System.out.println("Balance after withdrawals: $" + wallet.getBalance());

		// Set a new balance
		wallet.setBalance(5000.0);

		// Display the final balance
	System.out.println(wallet.getBalance());
	}
}


