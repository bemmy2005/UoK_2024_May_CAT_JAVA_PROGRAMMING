package Qwstion3;

public class Triangle {
	double length;
	double width;
	double area;
	double perimeter;
	//
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		this.area=(this.length*this.width)/2;
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		this.perimeter = this.length*this.width;
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = this.length*this.width;
	}
	

}
