//Nhial Luka Deng-239000417

package question_Five;

import java.util.Scanner;

public class TestStudent {
	private static int Age;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Student st1 = new Student();

		System.out.println("What is your Reg Number");
		st1.setRegnumber(input.nextInt());

		System.out.println("What is your First Name");
		st1.setFirstName(input.next());

		System.out.println("What is your LastName");
		st1.setLastName(input.next());

		System.out.println("What is your Dob");
		st1.setDob(input.nextInt());

		st1.setFullName();
		st1.setAge();

		if(Age < 16){
			//System.out.println("Your are stil a baby, no one needs your information");	
		}
		System.out.println("Hello My Dear, I am "+st1.getFullName() );
		System.out.println("And I am "+st1.getAge() );
	}


}


