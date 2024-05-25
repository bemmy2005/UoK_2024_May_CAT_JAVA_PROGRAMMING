
package question.three;
import java.lang.Math;
public class Circle extends Shape2D{
public double radius;

public Circle(double radius) {
	super();
	this.radius = radius;
}

@Override
double calcalateArea() {
	// TODO Auto-generated method stub
	return Math.PI*Math.pow(this.radius, 2);
}

@Override
double calculatePerimeter() {
	// TODO Auto-generated method stub
	return 2*Math.PI*this.radius;
}

}


//}
