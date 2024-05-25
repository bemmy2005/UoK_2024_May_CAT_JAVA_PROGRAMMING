package QuestionFive;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int age;
		int ages[]=new int[2];
		String names[]=new String[2];
		int currentyear=2024;
		String fullname;
		for(int i=0;i<=ages.length-1;i++){
			System.out.println("what is your year of birth:");
			int dob=input.nextInt();
			//call the method
			age=calculateage(dob,currentyear);
			if (age<16){
				System.out.println(age+"? you are under age! no more discusion");	 
			}
			else {
				ages[i]=age;
				System.out.println("Enter your First name:");
				String fname=input.next();
				System.out.println("Enter your Last name:");
				String lname=input.next();
				fullname=getfullname(fname, lname);
				names[i]=fullname;
				display(names[i], ages[i]);
			}
		}
	}
	static int calculateage(int dob,int cy){
		return cy-dob;
	}
	static String getfullname(String f,String l){
		return(f+" "+l);
	}
	static void display(String fullname ,int age){
		System.out.println("My name is "+fullname+", and I am "+age+" years old!");
	}


}
