package Shape;

public class Rectangle extends ShapeTwoDimensional {

    private double width;
    private double breadth;

    public Rectangle(double width, double breadth) {
        setWidth(width);
        setBreadth(breadth);
    }

    public double calculateArea() {
        return width * breadth;
    }

    public double calculatePerimeter() {
        return (2 * width) + (2 * breadth);
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = Math.abs(breadth);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.abs(width);
    }
}
