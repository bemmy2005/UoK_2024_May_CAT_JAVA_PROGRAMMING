package question4;
import java.util.Scanner;
public class TestCircle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Circle C=new Circle();
		System.out.println("Enter the radius of the circle");
		 Circle.setRadius(input.next());
		System.out.println("Area of circle is:"+Circle.Radius);
		System.out.println("Circumference of circle is:"+Circle.Radius);
	}}
