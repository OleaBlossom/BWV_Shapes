package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public class RightPrism<T extends ShapeTwoDimensional> extends WithTwoDimensionalBase<T> {

    public RightPrism(T base, double height) {
        super(base, height);
    }


    @Override
    public double calculateSurfaceArea() {
        // 2 × (BA) + P × H
        T base = getBase();
        return 2 * base.calculateArea() + base.calculatePerimeter() * getHeight();
    }

    @Override
    public double calculateVolume() {
        // BA × H
        return getBase().calculateArea() * getHeight();
    }
}
