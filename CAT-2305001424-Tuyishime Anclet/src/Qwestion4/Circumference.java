package Qwestion4;

public class Circumference {


	public class Shape {
		public class Sphere extends Circumference {
		    private double radius;

		    public Sphere(double radius) {
		        this.radius = radius;
		    }

			public double calculateSurfaceArea() {
				return 4 * Math.PI * Math.pow(radius, 2);
		 
			}

			public double calculateradius(int r) {
				 return (22/7*r*r / 3) * Math.PI * Math.pow(radius, 3);
			}
		
	}


	}


}
