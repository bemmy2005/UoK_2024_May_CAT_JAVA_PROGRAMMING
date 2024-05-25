package Qwestion4;

public class Area {
	    private double radius;
	    private double height;

	    public Area(double radius, double height) {
	        this.radius = radius;
	        this.height = height;
	    }

	    public double calculateSurfaceArea() {
	        return 2 * Math.PI * radius * (radius + height);
	    }

	    public double calculateArea() {
	        return Math.PI * Math.pow(radius, 2) * height;
	    }
	}

