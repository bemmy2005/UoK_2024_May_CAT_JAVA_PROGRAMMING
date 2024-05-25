//INEZA Aimee Nicole
package questionfour;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        Circle Circle=new Circle();

        System.out.print("Enter the radius: ");
        int r = scanner.nextInt();
        System.out.println("Area: " +Circle.getArea());
        System.out.println("Perimeter: " + Circle.getCircumference());

        scanner.close();
    }
}
