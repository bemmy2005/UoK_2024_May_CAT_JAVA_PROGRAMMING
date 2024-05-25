//BYIRINGIRO EMMANUEL
package question_3;

public class Circle extends Shape2D{
	public int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double calculatearea() {
		return (Math.PI*this.radius*this.radius);
	}

	public double calculateperimeter() {
		return (2*Math.PI*this.radius);
	}

}
