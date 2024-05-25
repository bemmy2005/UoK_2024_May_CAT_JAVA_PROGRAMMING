package question.four;

public class Circle {
private int radius;
private int pi;
private int area;
private int circumference;
//constructor
public int getRadius() {
	return radius;
}
//getters and setters
public void setRadius(int radius) {
	this.radius = radius;
}

public int getPi() {
	return pi;
}
public void setPi(int pi) {
	this.pi = pi;
}
public int getArea() {
	return area;
}
public void setArea() {
	this.area = radius*radius*pi;
}
public int getCircumference() {
	return circumference;
}
public void setCircumference() {
	this.circumference = radius*2*pi;
}

}
