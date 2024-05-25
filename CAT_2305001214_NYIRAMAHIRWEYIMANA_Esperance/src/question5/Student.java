package question5;

public class Student {
	String Regnumber;
	String Firstname;
	String Lastname;
	String fullname;
	String Db;
	int age;
	public String getRegnumber() {
		return Regnumber;
	}
	public void setRegnumber(String regnumber) {
		Regnumber = regnumber;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = Firstname+Lastname;
	}
	public String getDb() {
		return Db;
	}
	public void setDb(String db) {
		Db = db;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
	public String toString() {
		return "Student [Regnumber=" + Regnumber + ", Firstname=" + Firstname
				+ ", Lastname=" + Lastname + ", fullname=" + fullname + ", Db="
				+ Db + ", age=" + age + "]";
	}
 void fullname() {
		// TODO Auto-generated method stub
		
	}
	

}
