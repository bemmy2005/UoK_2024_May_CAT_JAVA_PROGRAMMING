package question.five;

public class Student {
String regnumber;
String firstname;
String lastname;
String fullname;
int dob;
int age;
//generate getters and setters
public String getRegnumber() {
	return regnumber;
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

public void setRegnumber(String regnumber) {
	this.regnumber = regnumber;
}
public String getFullname() {
	return fullname;
}
public void setFullname() {
	this.fullname = firstname+" "+lastname;
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
	this.age = 2024-dob;
}
//call them
public String toString() {
	return "Student [regnumber=" + regnumber + ", fullname=" + fullname
			+ ", age=" + age + "]";
}

}
