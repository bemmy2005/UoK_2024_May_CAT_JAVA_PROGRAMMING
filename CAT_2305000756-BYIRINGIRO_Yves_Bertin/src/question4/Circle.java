package question4;
public class Circle {
static double Radius;
double Area;
double Circ;
public double getRadius() {
	return Radius;
}
public static void setRadius(String string) {
	Radius = Radius;
}
public double getArea() {
	return Area;
}
public void setArea() {
	Area = Math.PI*Math.pow(Radius, 2);
}
public double getCirc() {
	return Circ;
}
public void setCirc() {
	Circ = 2*(Math.PI*Radius);
}
public String CalculatePerimeter() {
	// TODO Auto-generated method stub
	return null;
}
public String CalculateArea() {
	// TODO Auto-generated method stub
	return null;
}
}
