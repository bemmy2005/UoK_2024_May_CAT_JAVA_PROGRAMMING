package Question_3;

public class triangle1 extends Shape2D {
	private double lenght;
    private double width;
    void square(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    double calculateSurfaceArea() {
        return (lenght*width);
    }
    double calculatePerimeter() {
        return(lenght+width*2);
    }

}
