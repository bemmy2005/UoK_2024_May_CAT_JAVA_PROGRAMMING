//AYITO MARIE GUYSE LAURE
package question.five;

public class Student {

//DECLARATION
	private String firstName;
	private String lastName;
	private String fullName;
	
	//private string firstName;
	//private string lastName;
	//private string fullName;
	private long regNumber;
	private int dob;
	private int age;
	
	//GENERATION OF GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/*public string getLastName() {
		return lastName;
	}*/
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	/*public void setFullName(string fullName) {
		this.fullName =lastName+" "+firstName;
	}*/
	
	public void setFullName(String fullName) {
		this.fullName =lastName+" "+firstName;
	}
	
	public long getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(long regNumber) {
		this.regNumber = regNumber;
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
	
	
	
	}


