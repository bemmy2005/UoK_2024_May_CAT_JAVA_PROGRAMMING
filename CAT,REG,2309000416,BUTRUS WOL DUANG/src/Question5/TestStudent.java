package Question5;
import java.util.Scanner;;
public class TestStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student= new Student ();

        // Request user input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your date of birth : ");
        String dob = scanner.nextLine();

   
        Student Student = new Student();
        Student.setLastName(firstName);
        Student.setFirstName(lastName);
       
        Student.setDob(dob);

        if (Student.getAge() < 16) {
            System.out.println("You are still a baby, no one needs your information!");
            System.out.println("Hello my Dear, I am " + Student.getFullName() +
             ", and I am " + Student.getAge() + " years old!");
       
            System.out.println("Hello my Dear, I am " + Student.getFirstName()); 
        }

}	

	}

//Name : Butrus wol
//RegNumber 2309000416

