
package question.three;
	import java.util.Scanner;
	public class Calculate {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int Choice;
			System.out.println("Select a shape to calculate:\n1. triangle \n2. Square \n3. Circle \n4. Rectangle");
			Choice = input.nextInt();
			if(Choice == 1) {
				int a;
				int b;
				int c;
				int base;
				int height;
				System.out.println("enter the length of the side A");
				a = input.nextInt();
				System.out.println("enter the length of the side B");
				b = input.nextInt();
				System.out.println("enter the length of the side C");
				c = input.nextInt();
				System.out.println("enter Base");
				base = input.nextInt();
				System.out.println("enter Height");
				height = input.nextInt();
				//Triangle Tri = new Triangle(a,b,c,base,height); 
				//System.out.println(Tri.calcalateArea());
				//System.out.println(Tri.calculatePerimeter());
			}else if(Choice == 2) {
				int Side;
				System.out.println("enter the length of the side");
				Side = input.nextInt();
				Square Sq = new Square(Side); 
				System.out.println(Sq.calcalateArea());
				System.out.println(Sq.calculatePerimeter());
			}else if(Choice == 3) {
				double radius;
				System.out.println("enter the radius");
				radius = input.nextDouble();
				Circle Ci = new Circle(radius); 
				System.out.println(Ci.calcalateArea());
				System.out.println(Ci.calculatePerimeter());
			}else if(Choice == 4) {
				int length;
				int width;
				System.out.println("enter length of the Rectangle");
				length = input.nextInt();
				System.out.println("enter width of the Rectangle");
				width = input.nextInt();
				Rectangle Re = new Rectangle(length, width); 
				System.out.println(Re.calcalateArea());
				System.out.println(Re.calculatePerimeter());
			}else {
				System.out.println("invalid input");
			}
		}

	}



