package question4;
//Jacques Mugisha 2309001177 BBIT
public class Testcircle {


public class Circle {
	double radius;
	double area;
	double circumference;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public double setArea() {
		this.area = Math.PI*this.radius*this.radius;
		return area;
	}
	public double getCircumference() {
		return circumference;
	}
	public double setCircumference() {
		this.circumference = 2*Math.PI*this.radius;
		return circumference;
	}
}}


