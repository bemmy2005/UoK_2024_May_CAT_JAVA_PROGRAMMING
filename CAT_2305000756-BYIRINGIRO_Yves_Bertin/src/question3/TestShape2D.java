package question3;
import java.util.Scanner;
import question4.Circle;
public class TestShape2D {
	public static void main(String[] args, String Choice) {
		Scanner input=new Scanner(System.in);
		System.out.println("Select 2D objects you want among:");
		System.out.println("1.Triangle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("4.Circle");
		String Choice=input.next();
		switch (Choice) {
		Choice:
			System.out.println("Enter the Side:");
		Triangle.setSide(input.next()); 
		System.out.println("Enter Base:");
		Triangle.setBase(input.next());
		System.out.println("Enter the Height:");
		Triangle.setHeight(input.next());
		Triangle Tr=new Triangle();
		System.out.println("Area: " + Tr.CalculateArea());
		System.out.println("Volume: " + Tr.CalculatePerimeter());
		break;
		Choice:
			System.out.println("Enter the Side:");
		Square.setSide(input.next());
		Shape2D Sq=new Square();
		System.out.println("Area: " + Sq.CalculateArea());
		System.out.println("Volume: " +Sq.CalculatePerimeter());
		break;
		Case:
			System.out.println("Enter the Width:");
		Rectangle.setWidth(input.next()); 
		System.out.println("Enter Length:");
		Rectangle.setLength(input.next());
		Shape2D Rct=new Rectangle();
		System.out.println("Area: " + Rct.CalculateArea());
		System.out.println("Volume: " + Rct.CalculatePerimeter());
		break;
		Case:
			System.out.println("Enter the radius of the circle");
		Circle.setRadius(input.next());
		Circle Cr=new Circle();
		System.out.println("Area: " + Cr.CalculateArea());
		System.out.println("Volume: " + Cr.CalculatePerimeter());
		break;
		default:
			System.out.println("Invalid choice!");
		}


	}

}
