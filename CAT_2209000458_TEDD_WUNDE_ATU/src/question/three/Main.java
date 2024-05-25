//TEDD WUNDE ATU 2209000458
package question.three;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//instantiating scanner
		Scanner input=new Scanner(System.in);
		
	//Aggregating Shape2D
		Shape2D shape=null;
		
	 //Prompting the user for shape to select
		System.out.println("Select a shape to calculate: ");
		System.out.println("1. Triangle");	
		System.out.println("2. Square");
		System.out.println("3. Circle");
	    System.out.println("4. Rectangle");
	    System.out.print("Enter your choice: ");
		int type=input.nextInt();
		if(type==1){
			System.out.print("Enter the base of the triangle:");
			int base=input.nextInt();
			System.out.print("Enter the height of the triangle:");
			int height=input.nextInt();
			shape=new Triangle(base,height);
			
		}else if(type==2){
			System.out.print("Enter the side length of the square: ");
			int sideLength=input.nextInt();
			shape=new Square(sideLength);
				
		} else if(type==3){
			System.out.print("Enter the radius of the circle: ");
			int radius=input.nextInt();
			shape=new Circle(radius);
			
		} else if (type==4){
			System.out.print("Enter the length of the rectangle: ");
			int length=input.nextInt();
			System.out.print("Enter the width of the rectangle: ");
			int width=input.nextInt();
			shape=new Rectangle(length,width);
		} else{
			throw new IllegalArgumentException("INVALID INPUT"); 
		}
		
		double area=shape.calculateArea();
		double perimeter=shape.calculatePerimeter();
		//final calculated output
		System.out.println("Area: " +area );
		System.out.println("Perimeter: "+perimeter);
		
		
		

	}

}
