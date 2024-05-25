//TEDD WUNDE ATU 2209000458
package question.four;
import java.util.Scanner;
public class TestCircle {

	
	public static void main(String[] args) {
	//instantiating object for scanner 
		Scanner input=new Scanner(System.in);
		
	//instantiating Circle 
		Circle circle=new Circle();
		
		//prompting the user for radius
		System.out.println("Enter the radius of your circle: ");
		double radius=input.nextInt();
		//inputing circle in the created circle object
		circle.setRadius(radius);
		
		circle.setArea();
		circle.setCircumference();
		
	double area=circle.getArea();
	double circumference=circle.getCircumference();
	
	//displaying output of all the fields of the circle
	System.out.println("Information of your circle.");
	System.out.println("Radius : "+radius);
	System.out.println("Area : "+area);
	System.out.println("Circumference : "+circumference);
		
		

	}

}
