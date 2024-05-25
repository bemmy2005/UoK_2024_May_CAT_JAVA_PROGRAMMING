package QuestionFour;

import java.util.Scanner;

public class TestCircle {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("radius:");
	        System.out.println("1. height");
	        

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Enter the radius of the sphere:");
	                double radius = scanner.nextDouble();
	                Circle Area = new Circle(radius, radius);
	                System.out.println("radius: " + Area.calculateSurfaceArea());
	                System.out.println("Area: " + Area.calculateVolume());
	                break;
	            case 2:
	               
	            default:
	                System.out.println("Invalid choice");
	        }

	        scanner.close();
	    }
	}