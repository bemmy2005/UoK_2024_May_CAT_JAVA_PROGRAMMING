package question_5;
//Nyirabaziga ituze Merveille


public class Student {

	private int regnumber; 
	private String Firstname;
	private String Lastname;
	private String fullname;
	private int dob;
	private int age;

	// Setters and getters for employeeID
	public void setregnumber(int employeeID) {
	    this.regnumber = employeeID;
	}

	public int getregnumber() {
	    return regnumber;
	}

	// Setters and getters for firstName
	public void setFirstName(String firstName) {
	    this.Firstname = firstName;
	}

	public String getFirstName() {
	    return Firstname;
	}

	// Setters and getters for lastName
	public void setLastName(String lastName) {
	    this.Lastname = lastName;
	}

	public String getLastName() {
	    return Lastname;
	}

	// Setter and getter for fullName
	public void setFullName() {
	    this.fullname = Lastname + " " + Firstname;
	}

	public String getFullName() {
	    return fullname;
	}

	// Setter and getter for dob
	public void setDob(int dob) {
	    this.dob = dob;
	}

	public int getDob() {
	    return dob;
	}

	// Setter and getter for age
	public void setAge() {
	    this.age = 2024 - dob;
	}

	public int getAge() {
	    return age;
	}

}

	
		

	


