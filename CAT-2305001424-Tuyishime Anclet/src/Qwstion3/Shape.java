package Qwstion3;

public class Shape {
	public class Sphere extends Shape {
	    private double radius;

	    public Sphere(double radius) {
	        this.radius = radius;
	    }

		public double calculateSurfaceArea() {
			return 4 * Math.PI * Math.pow(radius, 2);
	 
		}

		public double calculatearea() {
			 return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
		}
	
}


}
