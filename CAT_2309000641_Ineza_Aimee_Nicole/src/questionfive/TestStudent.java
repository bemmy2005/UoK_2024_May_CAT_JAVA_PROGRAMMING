//INEZA Aimee Nicole
package questionfive;
import java.util.Scanner;

public class TestStudent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter your year of birth (e.g., 1990):");
        int dob = scanner.nextInt();
        
        Student Student= new Student();
        Student.setFirstName(firstName);
        Student.setLastName(lastName);
        Student.setDob(dob);
        
        String fullName = Student.getFullName();
        int age = calculateAge(dob);
        
        if (age < 16) {
            System.out.println("You're still a baby, No one needs Your Information");
        } else{
            System.out.println("Hello my dear, I am %s, and I am %d years old!%n"+fullName+" "+ age);
           
        }
        scanner.close();
    }
    
    private static int calculateAge(int dob) {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - dob;
    }
}
