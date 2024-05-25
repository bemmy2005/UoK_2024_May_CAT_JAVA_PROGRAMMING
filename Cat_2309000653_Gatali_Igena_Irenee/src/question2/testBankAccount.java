//gatali igena irenee

package question2;
import java.util.Scanner;
public class testBankAccount{


	private static double nextdouble;

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		BankAccount b=new BankAccount();
		System.out.println("enter name");
		b.setName(scanner.next());
		System.out.println("enter money deposit");
		b.setDeposit(scanner.nextDouble());
System.out.println("enter money withdrow");
b.setWithdrow(scanner.nextDouble());
System.out.println(b.toString());
	
	}

}