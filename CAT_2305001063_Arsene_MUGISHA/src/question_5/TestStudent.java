package question_5;

import java.util.Scanner;

public class TestStudent {


	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter your date of birth");
		s1.setDob(in.nextInt());
		s1.setAge();
		if (s1.age<16){
			
			System.out.println("You are still a baby, no one needs your information");
		}
		else if(s1.age>16){
			System.out.println("Enter your first name");
			s1.setFname(in.next());
			System.out.println("Enter your Second name");
			s1.setLname(in.next());
			System.out.println("Enter regnumber");
			s1.setRegnumber(in.next());
			s1.setFullname();
			System.out.println("Hello my dear, I am "+s1.getFullname()+" and I am "+s1.getAge());
				
		}
		
		
	}

}
