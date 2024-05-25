package Question_3;
//Mugisha_hyacinthe_2305000838
public class triangle extends Shape2D {
	private static double side1;
    private static double side2;
    private static double side3;
    void triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    	 static double calculateSurfaceArea() {
 	        return  (b*h);
	}
    	 static double calculatePerimeter() {
 	        return (side1+side2+side3);
    	 }
}
