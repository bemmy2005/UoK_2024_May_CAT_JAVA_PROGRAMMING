//RUKUNDO NDANGIZI DIDIER

package question.four;

public class Circle {
    private double radius;
    private double area;
    private double circumference;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        setArea();
        setCircumference(); 
    }

    public double getArea() {
        return area;
    }

    private void setArea() {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return circumference;
    }

    private void setCircumference() {
        this.circumference = 2 * Math.PI * radius;
    }
}
