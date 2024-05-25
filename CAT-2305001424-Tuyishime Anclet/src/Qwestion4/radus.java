package Qwestion4;
public class radus {

		public class Sphere extends radus {
		    private double radius;

		    public Sphere(double radius) {
		        this.radius = radius;
		    }

			public double calculateSurfaceArea() {
				return 4 * Math.PI * Math.pow(radius, 2);
		 
			}

			public double calculateradus() {
				 return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
			}
		
	}


	}


