package question5;

import java.util.Scanner;

public class Studenttest {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int i=16;
		do{
			
		Student s1=new Student ();
		System.out.println("enter your Regnumber");
		s1.setRegnumber(input.next());
		System.out.println("enter your Firstname");
		s1.setFirstname(input.next());
		System.out.println("enter your Lastname");
		s1.setLastname(input.next());
		System.out.println("enter your Db");
		s1.setDb(input.next());
		s1.setAge();
		s1.fullname();
		Student student=s1;
		i++;}while(i<16);
		System.out.println(i);
		}
}
		
		
		
	


