package question.two;

import java.util.Scanner;

public class TestBank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount b = new Bankaccount(1000);
		Scanner s = new Scanner(System.in);
		
		//
		System.out.println("Enter what you want to do, \n1. deposit \n2. withdraw");
		int choice = s.nextInt();
	
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the amount you want to deposit");
			double balance =s.nextDouble();
			b.deposit(balance);
			System.out.println("You deposited : " + b.getBalance());
			break;
		case 2:
			System.out.println("Enter the amount want to withdraw");
			double withdraw =s.nextDouble();
			b.withdraw(withdraw);
			break;
		default:
			b.setBalance(1000);
			b.deposit(1000);
			b.withdraw(1000);
			System.out.println( "Balance " + b.getBalance());
		}

	}

}
