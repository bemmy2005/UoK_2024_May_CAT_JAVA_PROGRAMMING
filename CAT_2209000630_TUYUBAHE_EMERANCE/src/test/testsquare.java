package test;

import java.util.Scanner;

import QUESTION_3.square;

public class testsquare {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int sideLength = (int) input.nextDouble();

        square square = new square();
        square.setSide(sideLength);

        System.out.println("Square Information:");
        System.out.println("Side Length: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPermiter());


	}

}