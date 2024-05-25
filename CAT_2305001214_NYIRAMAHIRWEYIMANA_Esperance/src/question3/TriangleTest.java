package question3;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of b");
		double b=input.nextInt();
		System.out.println("enter the value of h");
		double h=input.nextInt();
		Triangle t1=new Triangle(b,h);
		t1.setArea();
		t1.setPerimeter();
		System.out.println(t1.toString());
		
	}

}
