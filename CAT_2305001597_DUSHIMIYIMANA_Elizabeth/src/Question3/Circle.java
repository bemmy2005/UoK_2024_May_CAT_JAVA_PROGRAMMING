package Question3;

public class Circle extends Shape2D{
	int radius;

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

	public void setArea() {
		// TODO Auto-generated method stub
		super.setArea(this.radius^2);
	}

	public void setPerimeter() {
		// TODO Auto-generated method stub
		super.setPerimeter(this.radius*2);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
