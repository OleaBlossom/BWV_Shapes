package ShapesThreeDimensional;

public class Sphere extends ShapeThreeDimensional {
    private double radius;

    public Sphere(double radius) {
        setRadius(radius);
    }

    @Override
    public double calculateSurfaceArea() {
        // 4πr^2
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        // (4/3)πr^3
        return 4 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
