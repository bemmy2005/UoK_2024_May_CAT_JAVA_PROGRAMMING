package question_3;

public class Rectangle extends Shape2D{
	
	double l;
	double w;
	public Rectangle(double calculateArea2, double calculatePerimeter2,
			double l, double w) {
		super();
		this.l = l;
		this.w = w;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public void setCalculateArea() {
		// TODO Auto-generated method stub
		this.setCalculateArea(this.l*this.w);
	}
	public void setCalculatePerimeter() {
		// TODO Auto-generated method stub
		this.setCalculatePerimeter((this.l+this.w)*2);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
