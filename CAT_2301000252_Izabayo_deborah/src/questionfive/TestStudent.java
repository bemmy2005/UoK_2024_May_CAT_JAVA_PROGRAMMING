package questionfive;
import java.util.Scanner;

public class TestStudent {


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your first name: ");
	        String firstName = scanner.nextLine();
	        
	        System.out.print("Enter your last name: ");
	        String lastName = scanner.nextLine();
	        
	        System.out.print("Enter your year of birth: ");
	        int dob = scanner.nextInt();
	        
	        Student Student = new Student();
	        Student.setFirstName(firstName);
	        Student.setLastName(lastName);
	        Student.setDob(dob);
	        
	        if (Student.getAge() < 16) {
	            System.out.println("You are still a baby, no one needs your information!");
	        } else {
	            System.out.println("Hello my Dear, I am " + Student.getFullName() + ", and I am " + Student.getAge() + " years old!");
	            if (Student.getAge() >= 18 && Student.getAge() < 22) {
	                System.out.println("You are qualified to student in primary school or High school");
	            } else if (Student.getAge() >= 22 && Student.getAge() < 28) {
	                System.out.println("You are qualified to student in College");
	            }
	        }
	        
	        scanner.close();
	    }
	


	}


