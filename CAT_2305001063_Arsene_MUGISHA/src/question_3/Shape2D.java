package question_3;

public abstract class Shape2D {
	
	double calculateArea;
	double calculatePerimeter;
	





	public Shape2D() {
		// TODO Auto-generated constructor stub
	}


	public double getCalculateArea() {
		return calculateArea;
	}

	public void setCalculateArea(double calculateArea) {
		this.calculateArea = calculateArea;
	}

	public double getCalculatePerimeter() {
		return calculatePerimeter;
	}

	public void setCalculatePerimeter(double calculatePerimeter) {
		this.calculatePerimeter = calculatePerimeter;
	}

	public String toString() {
		return "Shape2D [calculateArea=" + calculateArea
				+ ", calculatePerimeter=" + calculatePerimeter + "]";
	}
	
	

}
