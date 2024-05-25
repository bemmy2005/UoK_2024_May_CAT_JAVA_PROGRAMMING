//Nhial Luka Deng-239000417

package question_Five;

public class Student {
	int Regnumber;
	String firstName;
	String LastName;
	int Dob;
	String FullName;
	int Age;
	
	
	public int getRegnumber() {
		return Regnumber;
	}
	public void setRegnumber(int regnumber) {
		Regnumber = regnumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDob() {
		return Dob;
	}
	public void setDob(int dob) {
		Dob = dob;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName() {
		FullName = firstName+" "+LastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge() {
		Age = 2024 - Dob;
	}
	
	
	
	

}
