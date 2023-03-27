package Exercise1;

public class Circle {
    private double radius;
    private String color = "red";

    public Circle() {

    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
