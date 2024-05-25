package QuestionFour;

public class Circle {
	//
	    private double radius;
	    private double height;

	    public Circle(double radius, double Area) {
	        this.radius = radius;
	        this.height = Area;
	        
	    }

      //display the result
	    double calculateSurfaceArea() {
	        return 2 * Math.PI * radius * (radius + height);
	    }

	    
	    double calculateVolume() {
	        return Math.PI * radius * radius * height;
	    }
	}

