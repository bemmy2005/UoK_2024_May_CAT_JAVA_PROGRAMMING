package questionthree;

public class square extends shape2D{
private int side;
private int area;
private int perimeter;

	
	void calculateArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}

	void calculatePerimeter() {
		// TODO Auto-generated method stub
		this.perimeter=side*4;
	}

}
