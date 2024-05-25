package question_5;
//UMWARI ALINE 2309000976
import java.util.Scanner;
public class Teststudent {

	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Request user input
	        System.out.print("Enter your first name: ");
	        String firstName = scanner.nextLine();

	        System.out.print("Enter your last name: ");
	        String lastName = scanner.nextLine();

	        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
	        String dob = scanner.nextLine();

	        //Create Student object
	        Student student = new Student();
	        Student.setFirstName(firstName);
	        Student.setLastName(lastName);
	        Student.setDob(dob);

	        
	        if (Student.getAge() < 16) {
	            System.out.println("You are still a baby, no one needs your information!");
	        
	        }

	}

}

	 

	


