/*
 * BYIRINGIRO Yves Bertin   2305000756
 * Student informatins
 */
package question5;
public class Student {
	private int RegNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private int dob;
    private int age;

    // Getters
    public int getRegNumber() {
        return RegNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setRegNumber(int RegNumber) {
        this.RegNumber = RegNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName() {
        this.fullName = this.lastName + " " + this.firstName;
    }

    public void setDob(int dob) {
        this.dob = dob;
        // Calculate age
        this.age = 2024 - dob;
    }

    public void setAge(int age) {
        this.age = age;
    }}