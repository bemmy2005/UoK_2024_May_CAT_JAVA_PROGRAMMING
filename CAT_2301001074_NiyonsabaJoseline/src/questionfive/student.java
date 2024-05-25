package questionfive;

public class student {
private int regnumber;
private String firstname;
private String lastname;
private String fullname;
private int dob;
private int age;
public int getRegnumber() {
	return regnumber;
}
public void setRegnumber(int regnumber) {
	this.regnumber = regnumber;
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
public void setFullname() {
	this.fullname = lastname+" "+firstname;
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
	this.age =2024-dob;
}

}
