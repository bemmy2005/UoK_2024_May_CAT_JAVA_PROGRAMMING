package Question_four;

public class Circle {
	//declaration of variables
int radius;
int area;
int pi;
int r;
double circumference;
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public int getArea() {
	return area;
}
public void setArea() {
	this.area = this.pi*this.r*this.r;
}
public double getCircumference() {
	return circumference;
}
public void setCircumference() {
	this.circumference = (this.pi*this.r)*2;
}
public String toString() {
	return "Circle [radius=" + radius + ", area=" + area + ", pi=" + pi
			+ ", r=" + r + ", circumference=" + circumference + "]";
}

}
