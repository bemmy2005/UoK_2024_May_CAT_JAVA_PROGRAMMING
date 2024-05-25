package question_3;

public class Triangle extends Shape2D{
	private int base;
	private int heigth;
	public Triangle(int base, int heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public double calculatearea() {
		return ((this.base*this.heigth)/2);
	}
	public double calculateperimeter() {
		return (this.base+this.heigth+(Math.pow(base, 2)+Math.pow(heigth,2)));
	}
	

}
