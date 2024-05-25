package Question3Test;

import java.awt.Shape;
import java.util.Scanner;

import Question3.Circle;
import Question3.Shape2D;
import Question3.Square;
import Question3.Triangle;

public class Test {
	public static void main(String[]args){
	
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);

	        System.out.println("Select a shape to calculate Area and Perimeter:");
	        System.out.println("1. Sphere,  2. Cylinder,  3. Cuboid");
	        int choice = input.nextInt();

	        Shape2D shape = null;

	        switch (choice) {
	            case 1:
	                System.out.println("Enter the radius of the circle: ");
	                int radiuscircle = (int) input.nextDouble();
	                shape = new Circle(radiuscircle);
	                break;
	            case 2:
	                System.out.println("Enter the lenght of the Square: ");
	                int length = input.nextInt();
	                shape=new Square(length);
	               
	                break;
	            case 3:
	                System.out.println("Enter the length of the Triangle: ");
	                 length = input.nextInt();
	                System.out.println("Enter the height of the Triangle: ");
	                int height= input.nextInt();
	                System.out.println("Enter the base of the Triangle: ");
	                int base = input.nextInt();
	                shape = new Triangle(length,height,base);
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                
	        }

	        System.out.println("Surface Area: " + shape.getArea());
	        System.out.println("Volume: " + shape.setPerimet());

	    }


		



	}


