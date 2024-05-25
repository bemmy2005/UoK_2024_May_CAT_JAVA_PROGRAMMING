//gatali igena irenee
package question5;

public class Student {


	
	private	String Regnumber;
	private String Fname;
	private String Lname;
	private String fullname;
	private int dob;
	private int age;
	private int yaer =2024;
	public String getRegnumber() {
		return Regnumber;
	}
	public void setRegnumber(String string) {
		Regnumber = string;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getFullname() {
		return fullname=Fname+""+Lname;
	
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age= 2024-dob;

	}
	public void setAge(int age) {
		this.age = age;
	}

	}


