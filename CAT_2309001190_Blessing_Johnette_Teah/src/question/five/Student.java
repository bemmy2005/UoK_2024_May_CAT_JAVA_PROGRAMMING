package question.five;

public class Student {
	
	//Declaring the field of the Student class
	private String regNumber;
	private String firstName;
	private String lastName;
	private String fullname;
	private int dob;
	private int age =0;
	
	
	
	//Getters and setters of the field
	
	
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname() {
		this.fullname = this.firstName+ " "+ this.lastName;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = 2024 - this.dob;
	
	}
	
}
