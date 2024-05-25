package questionfive;

public class Student {
	 private int employeeREG;
	    private String firstName;
	    private String lastName;
	    private String fullName;
	    private int dob;
	    private int age;

	    // Setters
	    public void setEmployeeID(int employeeID) {
	        this.employeeREG = employeeID;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	        updateFullName();
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	        updateFullName();
	    }

	    public void setDob(int dob) {
	        this.dob = dob;
	        updateAge();
	    }

	    // Getters
	    public int getEmployeeID() {
	        return employeeREG;
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

	    // Update methods
	    private void updateFullName() {
	        this.fullName = lastName + " " + firstName;
	    }

	    private void updateAge() {
	        this.age = 2024 - dob;
	    }
	}

	
	       
