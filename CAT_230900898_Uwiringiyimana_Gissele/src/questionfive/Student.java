package questionfive;
//import java.util.scanner;
public class Student{
	String regnumber;
	int Dob;
	String fname;
	String lname;
	String gender;
	//To be calculated
	String fullname;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {//parameter could be removed
		this.fullname = this.fname+this.lname;//Missing something to combines them
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = 2024-this.Dob;
	}

}



