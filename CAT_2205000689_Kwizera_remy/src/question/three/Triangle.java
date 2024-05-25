//Kwizera remy
//22005000689
package question.three;

public class Triangle extends Shape2D {
	public int base;
	public int height;
	public int a;
	public int b;
	public int c;
	public Triangle(int base, int height, int a, int b, int c) {
		super();
		this.base = base;
		this.height = height;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	double calcalateArea() {
		// TODO Auto-generated method stub
		return this.base*this.height;
	}
	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (this.base+this.height+Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2)));
	}
	

}
