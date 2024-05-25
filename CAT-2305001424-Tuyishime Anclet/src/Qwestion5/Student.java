package Qwestion5;

public class Student {

		int StudentID;
		String fname;
		String lname;
		String Fullnames;
		int dob;
		int age;
		public int getEmployeeID() {
			return StudentID;
		}
		public void setEmployeeID(int employeeID) {
			this.StudentID = employeeID;
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
		public String getFullnames() {
			return Fullnames;
		}
		public String setFullnames() {
			Fullnames = this.fname+" "+this.lname;
			return Fullnames;
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
		public int setAge() {
			this.age = 2024-this.dob;
			return age;
		}

		
	}


