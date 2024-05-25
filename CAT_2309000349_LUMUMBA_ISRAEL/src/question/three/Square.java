package question.three;

public class Square extends Shape2d {
int side;
//constructor
public Square(int side) {
	super();
	this.side = side;
}
//generate Getters and Setters
public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

public void setCalculateArea() {
	int calculateArea=this.side*this.side;
	super.setCalculateArea(calculateArea);
}

public void setCalculatePerimeter() {
	int calculatePerimeter=this.side*4;
	super.setCalculatePerimeter(calculatePerimeter);
}
//generate string
public String toString() {
	
	return super.toString();
}


}
