package Qwstion3;

public class Rectangle {
	int l;
	int w;
	int area;
	int perimeter;
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
	public int getArea() {
		this.setArea(this.l*this.w);
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPerimeter() {
		this.perimeter=(this.l+this.w/2);
		return perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

}
