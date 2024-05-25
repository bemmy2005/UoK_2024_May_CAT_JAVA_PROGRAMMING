package question_3;

public class Square extends Shape2D{
	public int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public double calculatearea() {
		return (this.side*this.side);
	}

	public double calculateperimeter() {
		return (this.side*4);
	}


}
