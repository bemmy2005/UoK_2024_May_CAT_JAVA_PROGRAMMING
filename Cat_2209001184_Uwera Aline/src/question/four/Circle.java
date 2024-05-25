package question.four;

public class Circle {
	double radius;
	double Circumference;
	double Area;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getCircumference() {
		return Circumference;
	}
	public void setCircumference(double circumference) {
		Circumference = 2*Math.PI*this.radius;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		Area =Math.PI*Math.pow(this.radius, 2);
	}
	
}
