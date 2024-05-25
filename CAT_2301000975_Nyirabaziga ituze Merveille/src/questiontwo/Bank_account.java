//Nyirabaziga ituze Merveille

package questiontwo;

public class Bank_account {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	String bankaccount;
	String accountname;
	double d;
	double w;
	double balance;
	
	public Bank_account(){
		
	}
	public Bank_account(double deposit, double withdraw){
		
		this.d=deposit;
		this.w=withdraw;
		
	}
	public Bank_account(String bankaccount, String accountname, double d, double w,
			double balance) {
		super();
		this.bankaccount = bankaccount;
		this.accountname = accountname;
		this.d = d;
		this.w = w;
		this.balance = balance;
	}
	public String getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance = this.d-this.w;
	}
	public String toString() {
		return "Bank [accountname=" + accountname + ", balance=" + balance
				+ "]";
	}
	
	
}
