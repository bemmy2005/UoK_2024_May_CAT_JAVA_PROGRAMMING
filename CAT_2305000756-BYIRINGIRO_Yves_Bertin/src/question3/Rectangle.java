package question3;
public class Rectangle extends Shape2D{
int Length;
int Width;
	public int getLength() {
	return Length;
}
public void setLength(int length) {
	Length = length;
}
public int getWidth() {
	return Width;
}
public void setWidth(int width) {
	Width = width;
}
	@Override
	public double CalculateArea() {
		return this.Length*this.Width;
	}
	@Override
	public double CalculatePerimeter() {
		return (this.Length+this.Width)*2;
	}
	public static void setWidth(String next) {
		// TODO Auto-generated method stub
		
	}
	public static void setLength(String next) {
		// TODO Auto-generated method stub
		
	}}
