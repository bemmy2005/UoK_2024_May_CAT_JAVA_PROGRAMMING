
package question2;


public class TestBankAccount {
	
		public static void main(String[] args) {
		BankAccount account1=new BankAccount();
		
		account1.deposit(1000);
		account1.withdraw(500);
		System.out.println("Balance: "  +account1.getBalance());
		account1.setBalance(2000);
		System.out.println("Updated Balance: "  +account1.getBalance());
		
		account1.deposit(1000);
		account1.withdraw(500);
		System.out.println("Balance: "  +account1.getBalance());
		account1.setBalance(2000);
		System.out.println("Updated Balance: "  +account1.getBalance());
		
		BankAccount account2=new BankAccount(5000);
		System.out.println("Initial Balance: "  +account2.getBalance());
		account2.withdraw(1500);
		System.out.println("Balance after withdral: "  +account2.getBalance());
		account2.setBalance(3500,"TXN12345");
		System.out.println("Updated Balance: "  +account2.getBalance());
		}
		

	}//}
	



