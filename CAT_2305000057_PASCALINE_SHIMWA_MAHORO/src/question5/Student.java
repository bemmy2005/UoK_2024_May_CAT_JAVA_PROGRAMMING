//pascaline shimwa 2305000057
package question5;

public class Student {
		int regnumber;
		String fname;
		String lname;
		String Fullnames;
		int dob;
		int age;
		public int getregnumber() {
			return regnumber;
		}
		public void setregnumber(int regnumber) {
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


