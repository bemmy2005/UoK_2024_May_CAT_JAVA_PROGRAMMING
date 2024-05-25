//Kwizera remy
//22005000689
package question.three;

public class Square extends Shape2D{

public int side;

public Square(int side) {
	super();
	this.side = side;
}

@Override
double calcalateArea() {
	// TODO Auto-generated method stub
	return this.side*this.side;
}

@Override
double calculatePerimeter() {
	// TODO Auto-generated method stub
	return this.side*4;
}

}
