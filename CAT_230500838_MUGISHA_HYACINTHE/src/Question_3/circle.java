package Question_3;

public class circle extends Shape2D{
	private static double radius;
	void circle(double radius) {
        this.radius =radius;
	}
	static double calculateArea() {
        return (3.14*radius/360);
	}
	static double calculatePerimeter() {
        return(3.14*radius/2);
	}

}
