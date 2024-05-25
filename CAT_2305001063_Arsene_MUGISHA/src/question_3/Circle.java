package question_3;

public class Circle extends Shape2D{
	
	double radius;

	public Circle(double calculateArea2, double calculatePerimeter2,
			double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setCalculateArea() {
		// TODO Auto-generated method stub
		this.setCalculateArea(2*Math.PI*Math.pow(this.radius,2));
	}

	public void setCalculatePerimeter() {
		// TODO Auto-generated method stub
		this.setCalculatePerimeter(this.radius*2*Math.PI);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
