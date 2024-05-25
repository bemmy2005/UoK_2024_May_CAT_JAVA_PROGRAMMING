package question3;

public class Rectangle extends shape2D {
	int l;
	int w;
	public Rectangle(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setArea() {
		// TODO Auto-generated method stub
		super.setArea(l*w);
	}
	public void setPerimeter() {
		// TODO Auto-generated method stub
		super.setPerimeter((l*w)/2);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
