package question3;

public class sqare extends shape2D {
	int s;
	

	public sqare(int s) {
		super();
		this.s = s;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public void setArea() {
		// TODO Auto-generated method stub
		super.setArea(s*s);
	}

	public void setPerimeter() {
		// TODO Auto-generated method stub
		super.setPerimeter(s*4);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
