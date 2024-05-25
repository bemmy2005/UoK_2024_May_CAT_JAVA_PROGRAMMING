package Question5;

import java.util.Scanner;

public class Teststudent{

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		Student St1=new Student();

		System.out.println("Tell us your first name:");
		St1.fname=input.next();
		System.out.println("Tell us your last name:");
		St1.lname=input.next();
		System.out.println("Tell us your birthday:");
		St1.dob=input.nextInt();
		String Prefix=("Sojoo");
		String Middle=("yan");
		String Postfix=("1999");
		System.out.println("Prefix+fname+Middle+lname+Postfix+dob:");

		System.out.println("Hello my dear, "+"I am"  +"and I am years old!");

		System.out.println("you are still a baby:");







	}
}
