package question_5;

public class Student {
    private int reg;
    private String fName;
    private String lName;
    private String fullName;
    private int dob;
    int age;
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName() {
		this.fullName =this.fName+" "+this.lName;
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
