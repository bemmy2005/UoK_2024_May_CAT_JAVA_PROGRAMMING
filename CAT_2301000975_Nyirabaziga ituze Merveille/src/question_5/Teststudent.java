//Nyirabaziga ituze Merveille

package question_5;

import java.util.Scanner;

public class Teststudent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        Student Student = new Student();

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        Student.setFirstName(firstName);

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        Student.setLastName(lastName);
        
        System.out.println("enter your year of birth(YYYY:)");
        int dob = scanner.nextInt();
        Student.setDob(dob);
        Student.setFullName();
        Student.setAge();

        if (Student.getAge() < 16) {
        	System.out.println("Hello my Dear, I am " + Student.getFullName() + ", and I am " + Student.getAge() + " years old!");
        }
        System.out.println("You are still a baby, no one needs your information!");
        }
        }
	


