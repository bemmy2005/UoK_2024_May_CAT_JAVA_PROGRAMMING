package question3;

public class Triangle extends shape2D {
	private static final String math = null;
	double h;
	double b;
	public Triangle(double h, double b) {
		super();
		this.h = h;
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setArea() {
		// TODO Auto-generated method stub
		super.setArea((this.b*this.h)/2);
	}
	public void setPerimeter() {
		// TODO Auto-generated method stub
		super.setPerimeter(this.b*this.h);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
