package Question5;

public class Student {

	int regnumber;
	String fname;
	String lname;
	String fullname;
	//String dob;
	int dob;
int Currentyear=2024;
int age;

public int getRegnumber() {
	return regnumber;
}

public void setRegnumber(int regnumber) {
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
	this.fullname =(lname+" "+fname);
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
	this.age =(Currentyear-dob);
}









}
