//TEDD WUNDE ATU 2209000458
package question.five;
import java.util.Scanner;
public class TestStudent {


	public static void main(String[] args) {
		//creating scanner object
		Scanner input=new Scanner(System.in);
		
		//instantiating Student object
		Student student=new Student();
		
		//Prompting the user for his firstname and setting it
		System.out.println("Enter your Firstname: ");
		String Firstname=input.next();
		student.setFirstname(Firstname);
		
		//Prompting the user for his lastname and setting it
		System.out.println("Enter your Lastname: ");
		String lastname=input.next();
		student.setLastname(lastname);
		
		//setting fullname
		student.setFullname();
		
		//Prompting the user for his dob and setting it
		System.out.println("Enter your birth year(Dob): ");
		int dob=input.nextInt();
		student.setDob(dob);
		
		//setting age
		student.setAge();
		
		String Fullname=student.getFullname();
		int age=student.getAge();
		
		if(age<16){
			System.out.println("You are still a baby,no one needs your information!");
			
		}else {
			System.out.println("Hello my Dear, I am "+Fullname+" , and I am "+age+" years old!");
		}
		
		
		
		
		
		
		

	}

}
