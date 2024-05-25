package Question_3;


public class testShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 java.util.Scanner scanner = new java.util.Scanner(System.in);
	        System.out.println("Select a shape:");
	        System.out.println("1. square");
	        System.out.println("2. circle");
	        System.out.println("3. triangle");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter the value of the square: ");
	                double squarearea = scanner.nextDouble();
	               square s1 = new square();
	                System.out.println("Surface Area of the square: " + square.calculateSurfaceArea());
	                System.out.println("perimeter of the square: " + square.calculatePerimeter());
	                break;
	            case 2:
	                System.out.print("Enter the lenght of the triangle: ");
	                double trianglelenght = scanner.nextDouble();
	                System.out.print("Enter the width of the triangle: ");
	                double trianglewidth = scanner.nextDouble();
	               triangle t1 = new triangle();
	                System.out.println("Surface Area of the triangle: " + triangle.calculateSurfaceArea());
	                System.out.println("perimeter of the triangle: " + triangle.calculatePerimeter());
	                break;
	            case 3:
	                System.out.print("Enter the radius of the circle: ");
	                double radiuscircle = scanner.nextDouble();
	                circle cuboid = new circle();
	                System.out.println("Surface Area of the circle: " + circle.calculateArea());
	                System.out.println("perimeter of the circle: " + circle.calculatePerimeter());
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	}


}
