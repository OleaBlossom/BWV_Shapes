package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public class RightPrism<T extends ShapeTwoDimensional> extends WithTwoDimensionalBase<T> {

    public RightPrism(T base, double height) {
        super(base, height);
    }


    @Override
    public double calculateSurfaceArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
