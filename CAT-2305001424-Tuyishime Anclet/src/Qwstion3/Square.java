package Qwstion3;

public class Square {
	
	     double sideLength;
	     double area;
	     double perimeter;

	    // Getters
	    public double getSideLength() {
	        return sideLength;
	    }

	    public double getArea() {
	        return area;
	    }

	    public double getPerimeter() {
	        return perimeter;
	    }

	    // Setters
	    public void setSideLength(double sideLength) {
	        this.sideLength = sideLength;
	        this.area = sideLength * sideLength;
	        this.perimeter = 4 * sideLength;
	    }
	    }

	