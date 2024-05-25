package question.three;

public class Triangle extends Shape2d{
private int b;
private int h;
//constructor
public Triangle(int b, int h) {
	super();
	this.b = b;
	this.h = h;
}
public Triangle() {
	// TODO Auto-generated constructor stub
}
//getters and setters
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public int getH() {
	return h;
}
public void setH(int h) {
	this.h = h;
}
public void setCalculateArea() {
	int calculateArea=this.b*this.h;
	super.setCalculateArea(calculateArea);
}
public void setCalculatePerimeter() {
	int calculatePerimeter=(int) (this.b+this.h+(Math.sqrt(Math.pow(b,2)+Math.pow(h, 2))));
	super.setCalculatePerimeter(calculatePerimeter);
}
//generate to string
public String toString() {
	
	return super.toString();
}


}
