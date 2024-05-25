package question3;
public class Square extends Shape2D{
int Side;
	public int getSide() {
	return Side;
}
public void setSide(int side) {
	Side = side;
}
	@Override
	public double CalculateArea() {
		return this.Side*this.Side;
	}

	@Override
	public double CalculatePerimeter() {
		return this.Side*4;
	}
	public static void setSide(String next) {
		// TODO Auto-generated method stub
		
	}

}
