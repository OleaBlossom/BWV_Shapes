package Shape;

public class PolygonRegular
        extends ShapeTwoDimensional {

    private int numberOfSides;
    private double sideLength;

    public PolygonRegular(int numberOfSides, double sideLength) {
        this.setNumberOfSides(numberOfSides);
        this.setSideLength(sideLength);
    }

    public double calculateArea() {
        return 0; // todo: first implement incircle and excirle
    }

    public double calculatePerimeter() {
        return numberOfSides * sideLength;
    }

    public void setNumberOfSides(int n) {
        this.numberOfSides = n;
    }

    public void setSideLength(double length) {
        this.sideLength = length;
    }

}
