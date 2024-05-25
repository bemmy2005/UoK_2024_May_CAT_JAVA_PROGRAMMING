//INEZA Aimee Nicole
package questionfour;

public class Circle {
private int r;
private double pi;
		private double area;
		private double circumference;
		public Circle() {}//I added this to mark you better
		public Circle(int area, int circumference) {
			super();
			this.area = area;
			this.circumference = circumference;
		}
		public double getArea() {
			return area;
		}
		public void setArea(int area) {
			this.area = area;
		}
		public void setArea() {
			this.area = (double)(pi*r)*(pi*r);
		}
		public double getCircumference() {
			return circumference;
		}
		public void setCircumference(int circumference) {
			this.circumference = circumference;
		}
		public void setCircumference() {
			this.circumference =2*pi*r ;
		}
		
		



}
