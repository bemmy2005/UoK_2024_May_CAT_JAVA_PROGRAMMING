//TEDD WUNDE ATU 2209000458
package question.three;

public class Square extends Shape2D{
	int sideLength;
	
	//constructor
	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}

	//overriding area method
	double calculateArea(){
		return(this.sideLength*this.sideLength);
	}
	
	//overriding perimeter method
	double calculatePerimeter(){
		return(this.sideLength*4);
	}

}
