package Qwstion3;

import java.util.Scanner;

public class Testofshape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Select a shape to calculate its surface area and volume:");
		        System.out.println("1. Triangle");
		        System.out.println("2. sqwere");
		        System.out.println("3. shape");
		        System.out.println("4. Rectangle");
		        
		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.print("Enter the radius of the sphere: ");
					break;
		            case 2:
		                System.out.print("Enter the radius of cicle: ");
					System.out.print("Enter the height of the circle: ");
					break;
		            case 3:
		                System.out.print("Enter the length of the shape: ");
					System.out.print("Enter the width of the shape: ");
					System.out.print("Enter the height of the shape: ");
					break;
		            default:
		                System.out.println("Invalid choice.");
		                System.exit(0);
		        }


		      
		    }

		

	}


