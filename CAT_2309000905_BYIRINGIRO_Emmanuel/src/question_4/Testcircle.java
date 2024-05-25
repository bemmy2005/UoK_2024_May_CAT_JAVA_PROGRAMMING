package question_4;

import java.util.Scanner;

public class Testcircle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		circle c1=new circle();
		System.out.println("enter a radius");
		int r = input.nextInt();
		System.out.println(c1.toString());
	}

}
