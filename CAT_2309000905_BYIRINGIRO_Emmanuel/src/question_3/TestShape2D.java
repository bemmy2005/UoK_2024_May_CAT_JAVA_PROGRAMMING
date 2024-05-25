package question_3;

import java.util.Scanner;

public class TestShape2D {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("select a shape to calculate");
		System.out.println("1.triangle");
		System.out.println("2.square");
		System.out.println("3.circle");
		System.out.println("4.rectangle");
		int choise=input.nextInt();
		Shape2D shape= null;
		switch(choise){
		case 1:
		System.out.println("enter a base");
		int base = input.nextInt();
		System.out.println("enter a heigth");
		int heigth = input.nextInt();
		shape = new Square(heigth);
		break;
		case 2:
		System.out.println("enter a side");
		int  side= input.nextInt();
		shape = new Square(side);
		break;
		
	case 3:
	System.out.println("enter a radius");
	int radius = input.nextInt();
	shape = new Square(radius);
	break;
	case 4:
	System.out.println("enter a l");
	int l = input.nextInt();
	System.out.println("enter a w");
	int w = input.nextInt();
	shape = new Square(w);
	break;
	default:
		
		}
		 System.out.println("Area: " + shape.calculatearea());
	        System.out.println("Perimeter " + shape.calculateperimeter());
	}

}
