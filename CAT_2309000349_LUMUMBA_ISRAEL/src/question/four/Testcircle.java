package question.four;
import java.util.Scanner;
import question.four.Circle;
public class Testcircle {
public static void main(String [] args){
	Scanner input=new Scanner(System.in);
	Circle c=new Circle();
	c.setRadius(4);
	c.setPi(3);
	c.setArea();
	c.setCircumference();
	System.out.println(c.toString());
	
}
}
