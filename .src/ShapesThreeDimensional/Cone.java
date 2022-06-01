package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public class Cone extends Pyramid<Circle> {

    public Cone(Circle base, double height) {
        super(base, height);
    }

    @Override
    public double calculateLateralSurfaceArea() {
        // π x r x √(r² + h²)
        Circle base = getBase();
        double radius = base.getRadius();
        return Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public double calculateVolume() {
        // (πr2h)/3
        return (Math.PI * Math.pow(getBase().getRadius(), 2) * getHeight()) / 3;
    }
}
