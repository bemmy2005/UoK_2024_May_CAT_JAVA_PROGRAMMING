package questionthree;

public class Square {
	 private double sideLength;
	    private double area;
	    private double perimeter;

	    // Setter for side length
	    public void setSideLength(double sideLength) {
	        this.sideLength = sideLength;
	        // Update area and perimeter when side length is set
	        this.area = sideLength * sideLength;
	        this.perimeter = 4 * sideLength;
	    }

	    // Getter for side length
	    public double getSideLength() {
	        return sideLength;
	    }

	    // Getter for area
	    public double getArea() {
	        return area;
	    }

	    // Getter for perimeter
	    public double getPerimeter() {
	        return perimeter;
	    }
	}

	
