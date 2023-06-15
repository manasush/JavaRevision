package labAssignment;

public class Square implements Polygon {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}
}