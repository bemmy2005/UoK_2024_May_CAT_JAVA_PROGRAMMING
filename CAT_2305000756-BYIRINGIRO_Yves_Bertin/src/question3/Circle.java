package question3;
public class Circle extends Shape2D{
	int Radius;
	
	public int getRadius() {
		return Radius;
	}
	public void setRadius(int radius) {
		Radius = radius;
	}
	@Override
	public double CalculateArea() {
		return (Math.PI*Math.pow(Radius, 2));
	}
	@Override
	public double CalculatePerimeter() {
	
		return Math.PI*2*this.Radius;
	}
	public static void setRadius(String next) {
		// TODO Auto-generated method stub
		
	}
}
