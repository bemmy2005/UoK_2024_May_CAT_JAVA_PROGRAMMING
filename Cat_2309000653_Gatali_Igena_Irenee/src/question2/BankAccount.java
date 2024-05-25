//gatali igena irenee

package question2;

public class BankAccount{
private String accountName;
private double balance;
private double deposit;
private double withdrow;
public BankAccount() {
	super();
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public double getBalance() {
	return balance=this.deposit-this.withdrow;
}
public void setBalance(double balance) {
	this.balance = balance;

}
public double getDeposit() {
	return deposit;
}
public void setDeposit(double string) {
	this.deposit = string;
}
public double getWithdrow() {
	return withdrow;
}
public void setWithdrow(double withdrow) {
	this.withdrow = withdrow;
}
public String toString() {
	return "BankAccount [accountName=" + accountName + ", balance=" + balance
			+ ", deposit=" + deposit + ", withdrow=" + withdrow + "]";
}
public void setName(String next) {
	// TODO Auto-generated method stub
	
}

}

	


