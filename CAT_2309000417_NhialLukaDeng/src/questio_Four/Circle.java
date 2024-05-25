//Nhial Luka Deng-239000417

package questio_Four;

public class Circle {
	private double radius;
	private double area;
	private double circumference;


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
		this.area = (this.radius+this.area)*2;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference() {
		this.circumference = 2/(this.radius*this.circumference);
	}
	public Circle nextInt() {
		return null;
	}



}
