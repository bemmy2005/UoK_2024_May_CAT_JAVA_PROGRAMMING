//TEDD WUNDE ATU 2209000458
package question.three;

public class Rectangle extends Shape2D{
	int length;
	int width;
	
	//constructor
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	//overriding area method
	double calculateArea(){
		return (this.length*this.width);
	}
	double calculatePerimeter(){
		return ((this.length*this.width)*2);
	}
	

}
