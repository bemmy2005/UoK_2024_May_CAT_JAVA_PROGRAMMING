//BYIRINGIRO EMMANUEL
package question_3;

public class Rectangle extends Shape2D{
	public int length;
	public int width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double calculatearea() {
		return (this.length*this.width);
	}
	public double calculateperimeter() {
		return (2*(this.length+this.width));
	}
	

}
