//gatali igena irenee

package question4;

public class Circle {
private  double radius;
private double area;
private double circumference;
public Circle() {
	super();
}
public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}
public double getArea() {
	return area=this.radius*this.radius*3.14;
}
public void setArea(double area) {
	this.area = area;
}
public void area(){
	
}
public double getCircumference() {
	return circumference=this.radius*2*3.15 ;
}
public void setCircumference(double circumference) {
	this.circumference = circumference;
	
}
public String toString() {
	return "Circle [radius=" + radius + ", area=" + area + ", circumference="
			+ circumference + "]";
}

	}


