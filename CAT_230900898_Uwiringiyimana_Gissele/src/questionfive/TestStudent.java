package questionfive;
public class TestStudent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter your year of birth (e.g., 1990):");
        int dob = scanner.nextInt();
        
        TestStudent student = new student ();
        student .setFirstName(firstName);
        student .setLastName(lastName);
        student .setDob(dob);
        
        int age = student .getAge();
        
        if (age < 16) {
            System.out.println("You are still a baby, no one needs your information!");
        } else {
            System.out.println("Hello my Dear, I am " + student .getFullName() + ", and I am " + age + " years old!");
        }
    }
}
