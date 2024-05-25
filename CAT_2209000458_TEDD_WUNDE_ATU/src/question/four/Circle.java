//TEDD WUNDE ATU 2209000458
package question.four;

public class Circle {
	double radius;
	double area;
	double circumference;
	//getter and setter for radius
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//getter and setter for area
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = (Math.PI*Math.pow(radius, 2));
	}
	//getter and setter for circumference
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference() {
		this.circumference = (2*Math.PI*radius);
	}
	
	
	
	

}
