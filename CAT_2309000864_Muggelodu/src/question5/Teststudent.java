package question5;

import java.util.Scanner;

public class Teststudent {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		Student st1 =new Student();
	System.out.println("enter your first name");
	st1.setFirstname(input.next());
	System.out.println("enter your lastname");
	st1.setLastname(input.next());
	System.out.println("enter your Dob");
	st1.setDob(input.next());
	System.out.println("enter Regnumber");
	st1.setRegnumber(input.next());

	
	System.out.println(st1.toString());


		
		

	}
}
