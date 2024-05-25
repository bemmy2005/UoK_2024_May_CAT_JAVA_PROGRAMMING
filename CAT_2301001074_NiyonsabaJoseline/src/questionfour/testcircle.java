//Niyonsaba Joseline
package questionfour;

import java.util.Scanner;

public class testcircle {

	private static final int PI = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a radius: ");
int radius=scanner.nextInt();
 double Area = (Math.PI*(radius*radius));
int circumferencedata = 2*PI*radius;
System.out.println(Area);
System.out.println("area: "+Area);
System.out.println("circumferencedata: "+circumferencedata);
}
}