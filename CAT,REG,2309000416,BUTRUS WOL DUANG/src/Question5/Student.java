package Question5;

public class Student {
	private String StudentID;
	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	private int dob;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = (lastName+" "+firstName);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(String dob2) {
		this.dob = (2024);
	}
	

}

//Name : Butrus wol 
//RegNumber: 2309000416
