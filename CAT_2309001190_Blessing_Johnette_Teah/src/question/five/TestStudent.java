package question.five;

import java.util.Scanner;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an instance of the Student object
		Student st = new Student();
		
		//taking user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String fname =scanner.next();
		st.setFirstName(fname);
		System.out.println("Enter your last name");
		String lname =scanner.next();
		st.setLastName(lname);
		String fullname = st.getFirstName();
		System.out.println("Enter your year of birth");
		int dob =scanner.nextInt();
		st.setDob(dob);
		st.setAge();
		int age1 = st.getAge();
		
		st.getFirstName();
		if(age1< 16)
		{
			System.out.println("You are still a baby, no one needs your information");
		}else
		{
			System.out.println("Hello my Dear, "+ "I am "+fullname + "and I am "+ age1 + "years old!");
		}
		
	

	}

}
