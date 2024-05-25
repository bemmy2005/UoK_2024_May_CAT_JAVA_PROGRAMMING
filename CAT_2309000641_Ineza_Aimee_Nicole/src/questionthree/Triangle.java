//INEZA Aimee Nicole
package questionthree;
class Triangle abstract Shape2D {
    private double l;
    private double b;

    public Triangle(double l, double b) {
        this.l = l;
        this.b = b;
       
    }

   
    public double calculateSurfaceArea() {
        return (l* b );
    }

    
    public double calculateVolume() {
        return l +b;
    }
}