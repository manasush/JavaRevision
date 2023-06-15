package labAssignment;

public class AreaCalculator {
	public static void main(String[] args) {
		// Creating instances of different polygons
		Rectangle rectangle = new Rectangle(5.0, 4.0);
		Square square = new Square(7.0);

		// Calculating and displaying areas
		System.out.println("Rectangle Area: " + rectangle.area());
		System.out.println("Square Area: " + square.area());
	}
}
