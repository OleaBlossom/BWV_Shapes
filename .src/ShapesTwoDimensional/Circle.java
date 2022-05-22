package ShapesTwoDimensional;

import static java.lang.Math.PI;

public class Circle implements ShapeTwoDimensional {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }
}
