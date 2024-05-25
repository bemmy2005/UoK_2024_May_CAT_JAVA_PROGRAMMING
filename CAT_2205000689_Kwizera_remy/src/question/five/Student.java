//Kwizera remy
//22005000689
package question.five;


public class Student {
	int regnumber;
	int dob;
	String firstname;
	String lastname;
	String fullname;
	int age;
	
	//getter and setters
	public int getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(int regnumber) {
		this.regnumber = regnumber;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = this.firstname+" "+this.lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = 2024 - this.dob;
	}
	
}
