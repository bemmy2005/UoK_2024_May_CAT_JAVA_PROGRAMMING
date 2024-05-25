//RUKUNDO NDANGIZI DIDIER

package question.five;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        LocalDate dob = null;
        while (dob == null) {
            try {
                dob = LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.print("Invalid date format. Please enter your date of birth (YYYY-MM-DD): ");
            }
        }

        Student teacher = new Student();
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setDob(dob);

        String fullName = teacher.getFullName();
        int age = teacher.getAge();

        if (age < 16) {
            System.out.println("You are still a baby, no one needs your information!");
        } else {
            System.out.println("Hello my Dear, I am " + fullName + ", and I am " + age + " years old!");
        }

        scanner.close();
    }
}
