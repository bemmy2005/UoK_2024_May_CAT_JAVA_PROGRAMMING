package Questin_five;

public class Student {
String regnumber;
String Fname;
String Fullname;
String lastname;

public String getFullname() {
	return Fullname;
}
public void setFullname(String fullname) {
	Fullname = fullname;
}
//generate getters and setters
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
int dob;
int age;
public String getRegnumber() {
	return regnumber;
}
public void setRegnumber(String regnumber) {
	this.regnumber = regnumber;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
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
public void setAge(int age) {
	this.age = age;
}
public String toString() {
	return "Student [regnumber=" + regnumber + ", Fname=" + Fname
			+ ", Fullname=" + Fullname + ", lastname=" + lastname + ", dob="
			+ dob + ", age=" + age + "]";
}

}
