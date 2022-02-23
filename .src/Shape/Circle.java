package Shape;

public class Circle extends ShapeTwoDimensional {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }
}
