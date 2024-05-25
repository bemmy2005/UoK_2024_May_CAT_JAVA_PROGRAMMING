package questionfive;

import java.util.Scanner;

public class teststudent {

	private static String fullname;

	/**
	 * @param args
	 * @param age 
	 */
	public static void main(String[] args, int age) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = scanner.next();
		System.out.println("Enter your last name: ");
		String lastname = scanner.next();
		System.out.println("Enter your yera of birth: ");
		int dob = scanner.nextInt();
		if(age<16){
			System.out.println("You are still a baby,no one needs your information!");
		}
		else{
			System.out.println("Hello my dear,I am " +fullname+" and I am "+age+" years old!");
		}
	}
}
