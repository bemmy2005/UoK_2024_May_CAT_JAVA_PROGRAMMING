package Qwestion4;

import java.util.Scanner;

public class Testofcircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Select a shape to calculate its surface area and circumference:");
		        System.out.println("1. circumference");
		        System.out.println("2. circle");
		        System.out.println("3. radus");
		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.print("Enter the radius of the sphere: ");
					break;
		            case 2:
		                System.out.print("Enter the radius of the circle: ");
					System.out.print("Enter the height of the circumference: ");
					break;
		            case 3:
		                System.out.print("Enter the length of the circle: ");
					System.out.print("Enter the width of the circle: ");
					System.out.print("Enter the height of the circle: ");
					break;
		            default:
		                System.out.println("Invalid choice.");
		                System.exit(0);
		        }

		      

		      
		    }

		

	}


