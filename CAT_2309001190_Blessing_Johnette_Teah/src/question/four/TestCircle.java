package question.four;

import java.util.Scanner;

public class TestCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is the instance of the class Circle
		Circle cr = new Circle();
		
		//This is to get the user input
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the radius of the circle");
		int radius =input.nextInt();
		cr.setRadius(radius);
		cr.setArea();
		cr.setCircum();
		
		System.out.println(cr.toString());

	}

}
