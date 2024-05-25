package question.four;

public class Circle {
	//Declaring the data for the class Circle
	private int radius;
	private double area;
	private double Circum;
	
	
	//Creating getters and setters
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = Math.PI *( this.radius * this.radius);
	}
	public double getCircum() {
		return Circum;
	}
	public void setCircum() {
		this.Circum = 2*Math.PI * this.radius;
	}
	
	//This is to display the information of the circle
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", Circum="
				+ Circum + "]";
	}
	
	
	

}
