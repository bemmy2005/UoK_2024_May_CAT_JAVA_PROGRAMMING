//TEDD WUNDE ATU 2209000458
package question.three;

public class Triangle extends Shape2D{
	int side1;
	int side2;
	int side3;
	int base;
	int height;
	//constructor
	public Triangle( int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	 //overiding area method
	double calculateArea(){
		return ((this.base*this.height)/2);
	}
	
	//overriding perimeter method
	double calculatePerimeter(){
		return(this.base+this.height+(Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2))));
	}
	
	
	
	
	
	
	

}
