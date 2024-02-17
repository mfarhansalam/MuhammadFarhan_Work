package Task2;

public class Circle {
    private double radius;
    private String color;

    // Constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}