//gatali igena irenee;

package question5;
import java.util.Scanner; 

import question2.BankAccount;
public class testStudent {


	private static String fullname;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		Student s=new Student();
		System.out.println("enter regnumber");
		s.setRegnumber(scanner.next());
		System.out.println("enter first name");
		s.setFname(scanner.next());
		System.out.println("enter seciond name");
		s.setLname(scanner.next());
		System.out.println("enter dob");
		s.setDob(scanner.nextInt());
		System.out.println("enter age");
		s.setAge(scanner.nextInt());
		int age = 0;
		if(age>=16){
			System.out.println("your are still a baby");
		
			System.out.println("hello my dear:i am"+fullname+" "+age+"i am yaers old");
		}
		
System.out.println(s.toString());
	

	}

}
