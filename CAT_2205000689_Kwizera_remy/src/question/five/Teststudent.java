//Kwizera remy
//22005000689
package question.five;
import java.util.Scanner;
public class Teststudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student st = new Student();
		System.out.println("Enter your regnumber:");
		st.setRegnumber(input.nextInt());
		System.out.println("Enter your first name:");
		st.setFirstname(input.next());
		System.out.println("Enter your last name:");
		st.setLastname(input.next());
		System.out.println("Enter your date of birth:");
		st.setDob(input.nextInt());
		st.setAge(0);
		st.setFullname(null);
		//checking if the user is appropriate of age
		if (st.getAge() < 16) {
			System.out.println("you are still a baby, no one need your information.");
		}else {
			System.out.println("Hello my dear, i am "+st.getFullname()+" , and i am "+st.getAge()+" years old.");
		}
	}

}
