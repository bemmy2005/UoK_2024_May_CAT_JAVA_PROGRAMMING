package Qwestion5;

import java.util.Scanner;

public class Testofstudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		        } else if (Student.getAge() > 18 && Student.setAge() < 22) {
		            System.out.println( "\nYou are qualified to teach in primary school or high school.");
		        } else if (Student.getAge() > 22 && Student.setAge() < 28) {
		            System.out.println("\nYou are qualified to teach in college.");
		        }

		       
		    }

			


	}


