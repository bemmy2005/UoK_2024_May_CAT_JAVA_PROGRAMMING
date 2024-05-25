package QUESTION4;

public class SHAPES {
	public class sphere extends SPAPES{
		 private double radius;

		    void Sphere(double radius) {
		        this.radius = radius;
		    }

		   
		    double calculateSurfaceArea() {
		        return 4 * Math.PI * Math.pow(radius, 2);
		    }

		    
		    double calculateVolume() {
		        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		    }

	}

}
