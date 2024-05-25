package Qwestion4;
	class Circle<lass> {
	     double length;
	     double width;
	     double height;

	    public Circle(double length, double width, double height) {
	        this.length = length;
	        this.width = width;
	        this.height = height;
	    }

	    public double calculateSurfaceArea() {
	        return 2 * (length * width + length * height + width * height);
	    }

	    public double calculateperimeter() {
	        return length * width * height;
	    }
	}


