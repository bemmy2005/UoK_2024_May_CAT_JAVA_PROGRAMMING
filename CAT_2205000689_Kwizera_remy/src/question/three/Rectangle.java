//Kwizera remy
//22005000689
package question.three;

public class Rectangle extends Shape2D{
	public int length;
	public int width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	double calcalateArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return this.length+this.width;
	}
	
}
