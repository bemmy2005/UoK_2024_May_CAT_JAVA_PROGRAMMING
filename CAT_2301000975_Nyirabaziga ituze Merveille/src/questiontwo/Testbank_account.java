//Nyirabaziga ituze Merveille

package questiontwo;

import java.util.Scanner;

public class Testbank_account {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		Bank_account b1=new Bank_account();

		System.out.println("Enter Your Name: ");
		b1.accountname=input.next();
		System.out.println("Enter the Account Number: ");
		b1.bankaccount=input.next();
		System.out.println("Enter the Deposit amount= ");
		b1.d=input.nextDouble();
		System.out.println("Enter the Withdraw Amount= ");
		b1.w=input.nextDouble();
		b1.setBalance();
		System.out.println(b1.toString());

	}



	}


