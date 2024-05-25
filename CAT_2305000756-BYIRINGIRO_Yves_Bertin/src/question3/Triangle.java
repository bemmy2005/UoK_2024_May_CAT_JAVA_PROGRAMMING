package question3;
public class Triangle extends Shape2D{
int Side;
int base;
int height;
	public int getSide() {
	return Side;
}
public void setSide(int side) {
	Side = side;
}
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
	public double CalculateArea() {
		return (this.base*this.height)/2;
	}
	public double CalculatePerimeter() {
		
		return this.base+this.height+this.Side;
	}
	public static void setSide(String next) {
		// TODO Auto-generated method stub
		
	}
	public static void setBase(String next) {
		// TODO Auto-generated method stub
		
	}
	public static void setHeight(String next) {
		// TODO Auto-generated method stub
		
	}
	
}