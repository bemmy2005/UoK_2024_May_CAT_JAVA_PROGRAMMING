//AYITO MARIE GUYSE LAURE
package question.four;

public class Circle {
	//DECLARATION
	private int radius;
	private int area;
	private int circumference;
	//Getters and setters
	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area = (int) (3.14*Math.sqrt(radius));
	}
	public int getCircumference() {
		return circumference;
	}
	public void setCircumference() {
		this.circumference = (int) (2*3.14*radius);
	}
	

}
