package questionthree;

public class rectangle extends shape2D {
private int length;
private int width;
private int area;
private int perimeter;
	void calculateArea() {
		// TODO Auto-generated method stub
		this.area=(length*width);
	}

	void calculatePerimeter() {
		// TODO Auto-generated method stub
		this.perimeter=(length+width)*2;
	}

}
