package question_5;

public class Student {
	
	String regnumber;
	String fname;
	String lname;
	String fullname;
	int dob;
	int age;
	public String getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname() {
		this.fullname = fname+" "+lname;
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
		this.age = 2024-this.dob;
	}
	
	

}
