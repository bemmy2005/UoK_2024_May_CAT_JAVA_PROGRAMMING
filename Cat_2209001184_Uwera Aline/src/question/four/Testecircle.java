package question.four;
import java.util.Scanner;
public class Testecircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle Ci = new Circle();
		System.out.println("enter radius");
		Ci.setRadius(input.nextDouble());
		Ci.setCircumference(0);
		Ci.setArea(0);
		System.out.println("the Area is"+Ci.getArea()+"\n the Circumference is "+Ci.getCircumference());
	}
}
