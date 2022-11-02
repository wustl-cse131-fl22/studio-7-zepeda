package studio7;

public class Rectangle {
	private double length;
	private double height;
	
	public Rectangle(double initheight, double initlength) {
		length = initlength;
		height = initheight;
	}
	
	public void print() {
		System.out.println("perimeter: " + (2 * length + 2 * height));
		System.out.println("Area: " + (height * length));
		if (height == length) {
			System.out.println("sqaure");
		}
		
	}
	
	public double area() {
		return length * height;
	}
	
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,5);
		Rectangle r2 = new Rectangle (3,4);
		if(r1.area() < r2.area()) {
			System.out.println("Rectangle 1 is smaller");
		}
		r1.print();
		r2.print();
	}
	
	
	
}

