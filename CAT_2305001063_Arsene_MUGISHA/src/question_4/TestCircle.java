package question_4;

import java.util.Scanner;

public class TestCircle {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		Circle c1=new Circle();
		
		System.out.println("Enter Radius");
		c1.setRadius(in.nextDouble());

		c1.setArea();
		c1.setCircumference();
		System.out.println(c1.toString());
		
	}

}
