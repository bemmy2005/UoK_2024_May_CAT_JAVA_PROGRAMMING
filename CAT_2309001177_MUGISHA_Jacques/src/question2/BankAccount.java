


public class BankAccount {
		double balance;
		String accountName;
		private String str;
		
		public BankAccount(){
			
		}
		public BankAccount(double balance, String accountName) {
			super();
			this.balance = balance;
			this.accountName = accountName;
		}
		public BankAccount(double balance) {
			super();
			this.balance = balance;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setBalance(double balance, String str){

			this.balance= balance;
			System.out.println("Balance Updated with STR: " +str);
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public void deposit(double amount){
			if(amount>0){
				balance+=amount;
			System.out.println("Deposited:"+amount);
			}else{
				System.out.println("Deposited amount must be positive.");
			}
		}
		public void deposit(String str){
			
		}
		public void withdraw(double amount){
			if(amount>0 && amount<=balance){
				balance-=amount;
				System.out.println("Withdrew: "+amount);
				
			}else{
				System.out.println("Invalid withdraw amount.");
			}
		}
		public void withdraw(String str){
			
		}
		
			
		
	}


