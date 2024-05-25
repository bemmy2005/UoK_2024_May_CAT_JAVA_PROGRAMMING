package question_3;

import java.util.Scanner;

public class TestShape2D {

	
	public static void main(String[] args) {
		
		int choose;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Choose between\n1.Triangle  \n2.Square  \n3.Circle  \n4.Rectangle");
		choose=in.nextInt();
			
		if(choose==1){
			
			Triangle t1=new Triangle(1, 1);
			System.out.println("Enter base");
			t1.setB(in.nextDouble());
			System.out.println("Enter Height");
			t1.setH(in.nextDouble());
			t1.setCalculateArea();
			t1.setCalculatePerimeter();
			System.out.println(t1.toString());
		}
		else if(choose==2){
			Square t1=new Square(2, 2, 2);
			System.out.println("Enter Side");
			t1.setS(in.nextDouble());
			t1.setCalculateArea();
			t1.setCalculatePerimeter();
			System.out.println(t1.toString());
		}
		else if(choose==3){
			Circle t1=new Circle(3, 3, 3);
			System.out.println("Enter Radius");
			t1.setRadius(in.nextDouble());
			t1.setCalculateArea();
			t1.setCalculatePerimeter();
			System.out.println(t1.toString());
		}
		else if(choose==4){
			Rectangle t1=new Rectangle(4, 4, 4, 4);
			System.out.println("Enter Length");
			t1.setL(in.nextDouble());
			System.out.println("Enter Height");
			t1.setW(in.nextDouble());
			t1.setCalculateArea();
			t1.setCalculatePerimeter();
			System.out.println(t1.toString());
		}
	}

}
