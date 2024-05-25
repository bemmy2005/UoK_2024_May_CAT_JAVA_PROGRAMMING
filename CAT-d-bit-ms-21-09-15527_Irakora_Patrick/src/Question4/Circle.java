package Question4;
//Irakora Patrick

public class Circle {
int Radius;
int area;
int circumference;
double p;
public int setRadius;
public String setCircumference;
public String setP;
public double getP() {
	return p;
}
public void setP(double p) {
	this.p = p();
}
private double p() {
	// TODO Auto-generated method stub
	return 0;
}
public int getRadius() {
	return Radius;
}
public void setRadius(int radius) {
	Radius = radius;
}
public int getArea() {
	return area;
}
public void setArea() {
this.area=(int)(this.p*this.Radius*2);
}
public int getCircumference() {
	return circumference;
}
public void setCircumference(int i) {
this.circumference =(int)(2*this.p*this.Radius);
}

}
