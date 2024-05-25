package question4;

public class CIRCLE {
	public int r;
	public int area;
	public int c;
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area =(int) (Math.PI*Math.pow(r, 2));
	}
	public int getC() {
		return c;
	}
	public void setC() {
		this.c =(int)(2*Math.PI*r) ;
	}
	public String toString() {
		return "circle [area=" + area + ", c=" + c + "]";
	}


}


