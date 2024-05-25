//TEDD WUNDE ATU 2209000458
package question.five;

public class Student {
	String regnumber;
	String Firstname;
	String lastname;
	String fullname;
	int dob; //year of birth
	int age;
	
	//Getter and setter for regnumber
	public String getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}
	//Getter and setter for firstname
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	//Getter and setter for lastname
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	//Getter and setter for fullname
	public String getFullname() {
		return fullname;
	}
	public void setFullname() {
		this.fullname = lastname+" "+Firstname;
	}
	//Getter and setter for dob
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	//Getter and setter for age
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = 2024-dob;
	}
	
	
}
