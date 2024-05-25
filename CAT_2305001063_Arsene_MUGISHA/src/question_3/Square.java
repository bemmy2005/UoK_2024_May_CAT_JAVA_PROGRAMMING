package question_3;

public class Square extends Shape2D{

	double s;

	public Square(double calculateArea, double calculatePerimeter, double s) {
		super();
		this.s = s;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public void setCalculateArea() {
		// TODO Auto-generated method stub
		this.setCalculateArea(this.s*this.s);
	}

	public void setCalculatePerimeter() {
		// TODO Auto-generated method stub
		this.setCalculatePerimeter(this.s*4);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
