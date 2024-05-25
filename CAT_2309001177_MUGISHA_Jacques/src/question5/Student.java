package question5;
//Jacques Mugisha 2309001177 BBIT
public class Student {
		int studentID;
		String fname;
		String lname;
		String Fullnames;
		int dob;
		int age;
		public int getstudentID() {
			return studentID;
		}
		public void setstudentID(int studentID) {
			this.studentID = studentID;
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
			return Fullnames = this.fname+" "+this.lname;
			
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


