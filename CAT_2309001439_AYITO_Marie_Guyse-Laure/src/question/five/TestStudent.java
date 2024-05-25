package question.five;

import java.util.Scanner;

public class TestStudent {

	
	public static void main(String[] args) {
	 
		//ENTER THE VALUE FROM THE USER OF THE FIRST NAME
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your first name");
		//firstName = input.toString();
		String firstName = input.toString();
		//ENTER THE VALUE FROM THE USER OF THE LAST NAME
		//Scanner input=new Scanner(System.in);
		System.out.print("Enter your last name");
		String lastName = input.toString();
		//lastName = input.toString();
		//ENTER THE VALUE FROM THE USER OF THE DATE OF BIRTH
		//Scanner input=new Scanner(System.in);
		System.out.print("Enter your dob");
		//dob = input.nextInt();
		int dob = input.nextInt();
	}

}
