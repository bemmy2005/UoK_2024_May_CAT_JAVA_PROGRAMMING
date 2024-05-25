package question_4;

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
	public void setArea() {
		this.area = Math.PI*Math.pow(radius,2);
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference() {
		this.circumference = 2*Math.PI*this.radius;
	}
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area
				+ ", circumference=" + circumference + "]";
	}
	
	

}
