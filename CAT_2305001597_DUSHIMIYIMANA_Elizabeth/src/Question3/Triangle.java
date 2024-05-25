package Question3;

public class Triangle extends Shape2D{
	int lenght;
	int base;
	int height;
	public Triangle(int lenght, int base, int height) {
		super();
		this.lenght = lenght;
		this.base = base;
		this.height = height;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void setArea() {
		// TODO Auto-generated method stub
		super.setArea((this.base*this.lenght)/2);
	}
	public void setPerimeter() {
		// TODO Auto-generated method stub
		super.setPerimeter(this.height+this.lenght+this.height);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	

}
