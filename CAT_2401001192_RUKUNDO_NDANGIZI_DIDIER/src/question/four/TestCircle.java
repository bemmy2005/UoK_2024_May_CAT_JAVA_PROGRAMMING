//RUKUNDO NDANGIZI DIDIER

package question.four;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        circle.setRadius(radius);

        System.out.println("Circle Information:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        scanner.close();
    }
}
