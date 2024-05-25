package question_5;

import java.util.Scanner;

public class Teststudent {


	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 Student s1 = new Student();
	        System.out.println("Enter your dob:");
	        s1.setDob(input.nextInt());
	        s1.setAge();
	        int age=s1.age;
	        if(age<16)
	        {
	        	System.out.println("you are still baby,no one needs your information");
	        }
	        else{
		        System.out.println("Enter your reg:");
		        s1.setReg(input.nextInt());
		        System.out.println("Enter your fname:");
		        s1.setfName(input.next());
		        System.out.println("Enter your lname:");
		        s1.setlName(input.next());
		        s1.setFullName();
		      

	        System.out.println("hello my dear, i am"+s1.getFullName()+", and i am"
	        		+s1.getAge()+" years old");
	        }
	}

}
