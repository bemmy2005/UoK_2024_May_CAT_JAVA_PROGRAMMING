/*
 * BYIRINGIRO Yves Bertin   2305000756
 * Student informations tests
 */
package question5;
import java.util.Scanner;
public class TestStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Student Student = new Student();
        System.out.println("Enter your first name:");
        Student.setFirstName(scanner.next());
        System.out.println("Enter your last name:");
        Student.setFirstName(scanner.next());
        System.out.println("Enter your year of birth:");
        Student.setDob(scanner.nextInt());
        Student.getFullName(); // Set full name based on first name and last name
        System.out.println("Hello my dear, I am " + Student.getFirstName() + ", and I am " + Student.getAge() + " years old!");
        // Check qualification
        if (Student.getAge() < 16) {
            System.out.println("You are still a baby, no one needs your information!");
        }else if (Student.getAge() >16) {
            System.out.println("Sorry! We can't find you!!!");
        }}	
	}
