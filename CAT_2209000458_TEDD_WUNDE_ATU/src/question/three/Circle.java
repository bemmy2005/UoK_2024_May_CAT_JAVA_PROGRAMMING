//TEDD WUNDE ATU 2209000458
package question.three;

public class Circle extends Shape2D{
	int radius;
	
	//constructor
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	//overriding area method
	double calculateArea(){
		return (Math.PI*Math.pow(this.radius, 2));
	}
	//overriding perimeter method
	double calculatePerimeter(){
		return  (2*Math.PI*radius);
	}

}
