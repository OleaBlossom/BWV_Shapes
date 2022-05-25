package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public abstract class Pyramid<T extends ShapeTwoDimensional> extends RightPrism<T> {

    public Pyramid(T base, double height) {
        super(base, height);
    }

    public abstract double calculateLateralSurfaceArea();

    @Override
    public void setBase(T base) {
        super.setBase(base);
    }
}
