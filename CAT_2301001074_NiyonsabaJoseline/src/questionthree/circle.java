package questionthree;

public class circle extends shape2D{
private static final int PI = 0;
private int radius;
private double area;
private int perimeter;

void calculateArea() {
	// TODO Auto-generated method stub
	this.area=(Math.PI*(radius*radius));
}

void calculatePerimeter() {
	// TODO Auto-generated method stub
	this.perimeter=2*PI*radius;
}
}
