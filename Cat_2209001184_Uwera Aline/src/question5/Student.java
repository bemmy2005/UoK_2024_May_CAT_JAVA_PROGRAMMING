package question5;

public class Student {
int regnumber;
int dob;
int age;
String lname;
String tname;
String fullname;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = 2024- this.dob;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = this.lname+" "+this.tname;
}

}
