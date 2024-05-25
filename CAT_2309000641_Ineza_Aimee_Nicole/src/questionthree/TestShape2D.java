//INEZA Aimee Nicole
package questionthree;

import java.util.Scanner;

public class TestShape2D {

	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.println("Select a shape to calculate its surface area and perimeter:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Rectangle");
        int choice = scanner.nextInt();

        Shape2D shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter the l: ");
                System.out.print("Enter the b: ");
                
                double Rectangle = scanner.nextDouble();
                
                break;
            case 2:
                System.out.print("Enter the lenght of side: ");
                double square = scanner.nextDouble();
                
               
                break;
            case 3:
                System.out.print("Enter the length of radius: ");
                double radius= scanner.nextDouble();
              
                break;
            case 4:
                System.out.print("Enter the length : ");
                double length= scanner.nextDouble();
                System.out.print("Enter the width : ");
                double width= scanner.nextDouble();
               
               
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("calculate Area: " + shape.calculateArea());
        System.out.println("calculate Perimeter: " + shape.calculatePerimeter());

      
    }

}

