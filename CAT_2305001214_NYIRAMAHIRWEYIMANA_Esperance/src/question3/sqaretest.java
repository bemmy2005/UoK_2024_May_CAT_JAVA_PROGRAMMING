package question3;

import java.util.Scanner;

public class sqaretest {
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("enter s");
	int s=input.nextInt();
	sqare s1=new sqare(s);
	s1.setArea();
	s1.setPerimeter();
	System.out.println(s1.toString());
	}

}
