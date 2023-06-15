package labAssignment;

public class EquilateralTriangle implements Polygon {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double height = Math.sqrt(3) / 2 * side; // Height of an equilateral triangle
        return 0.5 * side * height;
    }
}
