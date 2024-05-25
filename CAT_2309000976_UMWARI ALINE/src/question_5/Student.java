package question_5;
//UMWARI ALINE
import java.util.Scanner;
public class Student {

	
	 
	 
	
	
		
	
			
		    private String firstName;
		    private String lastName;
		    private String fullName;
		    private String dob;
		    private int age;
		    private int regnumber;
			public int getRegnumber() {
				return regnumber;
			}
			public void regnumber() {
				this.regnumber = regnumber;
			}
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName() {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName() {
				this.lastName = lastName;
			}
			public String getFullName() {
				return fullName;
			}
			public void setFullName() {
				this.fullName = fullName;
			}
			public String getDob() {
				return dob;
			}
			public void setDob() {
				this.dob = dob;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
				private void updateAge() {
			        int currentYear = 2024; // Assuming current year is 2024
			        int birthYear = Integer.parseInt(dob.substring(0, 4));
			        this.age = currentYear - birthYear;
			}
		    

		


	}


