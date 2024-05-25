package question_3;

public class Triangle extends Shape2D{
	
	
	
	double h;
	double b;
	private double setCalculatePerimeter;
	
	
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
	public void setCalculateArea() {
		// TODO Auto-generated method stub
		this.setCalculateArea((b*h)/2);
	}
	public void setCalculatePerimeter() {
		// TODO Auto-generated method stub
		this.setCalculatePerimeter(this.b+this.h+(Math.sqrt(Math.pow(b,2)+Math.sqrt(Math.pow(h,2)))));
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
