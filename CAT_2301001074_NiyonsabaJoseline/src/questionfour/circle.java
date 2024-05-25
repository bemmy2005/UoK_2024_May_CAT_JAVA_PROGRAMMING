package questionfour;

public class circle {
private static final int PI = 0;
private int radius;
private int area;
private int circumferencedata;
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
	this.area = (int) (Math.PI*(radius*radius));
}
public int getCircumferencedata() {
	return circumferencedata;
}
public void setCircumferencedata() {
	this.circumferencedata = 2*PI*radius;
}

}
