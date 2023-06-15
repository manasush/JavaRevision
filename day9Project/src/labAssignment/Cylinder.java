package labAssignment;

public class Cylinder {
    private double height;
    private double radius;

    // Constructor that takes height and radius
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Default constructor
    public Cylinder() {
        this.height = 20;
        this.radius = 10;
    }

    public static void main(String[] args) {
        // Write a Java program to demonstrate constructor overloading

        System.out.println("Taking the instance variables");

        // Create an instance using the default constructor
        Cylinder cl = new Cylinder();
        System.out.println("Radius: " + cl.getRadius());
        System.out.println("Height: " + cl.getHeight());
        double volume = Math.PI * Math.pow(cl.getRadius(), 2) * cl.getHeight();
        System.out.println("Volume of cylinder with instance variables: " + volume);

        System.out.println("\n---------------------------\n");

        System.out.println("Taking the overloaded variables");

        // Create an instance using the overloaded constructor
        Cylinder volOver = new Cylinder(30, 40);
        System.out.println("Radius: " + volOver.getRadius());
        System.out.println("Height: " + volOver.getHeight());

        double volumeOverLoaded = Math.PI * Math.pow(volOver.getRadius(), 2) * volOver.getHeight();
        System.out.println("Volume of cylinder with overloaded variables: " + volumeOverLoaded);
    }

    // Getters and setters for the instance variables
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
