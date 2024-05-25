package Question3;

public class Square extends Shape2D {
	int length;

	public Square(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setArea() {
		// TODO Auto-generated method stub
		super.setArea(this.length*this.length);
	}

	public void setPerimeter(int perimeter) {
		// TODO Auto-generated method stub
		super.setPerimeter(this.length*4);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
