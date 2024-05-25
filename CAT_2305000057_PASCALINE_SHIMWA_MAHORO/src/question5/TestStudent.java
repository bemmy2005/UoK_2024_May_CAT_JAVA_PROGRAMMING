//pascaline Shimwa 2305000057
package question5;

import java.util.Scanner;

public class TestStudent {
public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			Student Student= new Student();
			System.out.println("Enter your firstname ");
			String fname=in.next();
			Student.setFname(fname);
			System.out.println("Enter your lastname ");
			String lname=in.next();
			Student.setLname(lname);
			System.out.println("Enter your dob ");
			int dob=in.nextInt();
			Student.setDob(dob);
			
			System.out.println("Hello my Dear, I am " + Student.setFullnames()+ ", and I am " + Student.setAge() + " years old!");
			 
	 if (Student.setAge() < 16) {
	 System.out.println( "You are still a baby, no one needs your information!");
	 }
	           

	       
	    }

		


}
