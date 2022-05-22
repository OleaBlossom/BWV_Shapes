package ShapesTwoDimensional;

public class PolygonRegular extends ShapeTwoDimensional {

    private int numberOfSides;
    private double sideLength;

    public PolygonRegular(int numberOfSides, double sideLength) {
        this.setNumberOfSides(numberOfSides);
        this.setSideLength(sideLength);
    }

    public double calculateArea() throws IllegalArgumentException {
        Triangle triangle = new Triangle(sideLength, calculateExcircleRadius(), calculateExcircleRadius());
        return numberOfSides * triangle.calculateArea();
    }

    public double calculatePerimeter() {
        return numberOfSides * sideLength;
    }

    public double calculateIncircleRadius() {
        return sideLength / (2 * Math.tan(Math.PI / numberOfSides));
    }

    public double calculateExcircleRadius() {
        return sideLength / (2 * Math.sin(Math.PI / numberOfSides));
    }

    public void setNumberOfSides(int n) {
        this.numberOfSides = Math.abs(n);
    }

    public void setSideLength(double length) {
        this.sideLength = Math.abs(length);
    }

    public double getSideLength() {
        return sideLength;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
