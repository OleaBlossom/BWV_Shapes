package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public abstract class Pyramid<T extends ShapeTwoDimensional> extends WithTwoDimensionalBase<T> {

    public Pyramid(T base, double height) {
        super(base, height);
    }

    public abstract double calculateLateralSurfaceArea();

    public double calculateSurfaceArea() {
        return getBase().calculateArea() + calculateLateralSurfaceArea();
    }
}
