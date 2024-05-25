package questionthree;


	import java.lang.Math;

	public class Triangle {
	    private double sideA;
	    private double sideB;
	    private double sideC;
	    
	    public Triangle(double sideA, double sideB, double sideC) {
	        this.sideA = sideA;
	        this.sideB = sideB;
	        this.sideC = sideC;
	    }
	    
	    public double calculateArea() {
	        double s = calculatePerimeter() / 2; // Semiperimeter
	        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	    }
	    
	    public double calculatePerimeter() {//perimeter
	        return sideA + sideB + sideC;
	    }
	    
	    public static void main(String[] args) {
	        Triangle triangle = new Triangle(3, 4, 5); // lets take an example from a triangle with side lengths 3, 4, 5
	        double area = triangle.calculateArea();
	        double perimeter = triangle.calculatePerimeter();
	        
	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);
	    }
	}

