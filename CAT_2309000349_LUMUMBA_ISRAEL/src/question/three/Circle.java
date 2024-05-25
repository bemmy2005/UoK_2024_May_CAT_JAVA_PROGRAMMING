package question.three;

public class Circle extends Shape2d{
int r;
int area;
int perimeter;
//constructor
public Circle(int r) {
	super();
	this.r = r;
}
public Circle() {
	// TODO Auto-generated constructor stub
}
//setters and getters
public int getR() {
	return r;
}

public void setR(int r) {
	this.r = r;
}

public void setCalculateArea() {
	this.area=r*r;
	super.setCalculateArea(calculateArea);
}

public void setCalculatePerimeter() {
	this.perimeter=r*2;
	super.setCalculatePerimeter(calculatePerimeter);
}
//generate to string
public String toString() {
	
	return super.toString();
}


}


