package QUESTION4;

import java.util.Scanner;

public class TESTCIRCLE {

	 
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		CIRCLE circle =new CIRCLE();
		System.out.println("Enter the Radius of the Circle");
		int radius=input.nextInt();
		circle.setRadius(radius);
		System.out.println("the area and circumference of the Circle are:\n");
		System.out.println("Area: "+circle.setArea());
		System.out.println("Circumference: "+circle.setCircumference());
			}

		 

	

}
