package question_4;

import java.util.Scanner;

public class Testcircle {
		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
	Circle circle =new Circle();
	System.out.println("Enter the Radius of the Circle");
	int radius=input.nextInt();
	circle.setRadius(radius);
	System.out.println("the area and circumference of the Circle are:\n");
	System.out.println("Area: "+circle.setArea());
	System.out.println("Circumference: "+circle.setCircumference());
		}

	






	}


