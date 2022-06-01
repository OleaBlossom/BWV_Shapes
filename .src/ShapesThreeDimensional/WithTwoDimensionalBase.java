package ShapesThreeDimensional;

import ShapesTwoDimensional.ShapeTwoDimensional;

public class WithTwoDimensionalBase<T extends ShapeTwoDimensional> extends ShapeThreeDimensional {

    private T base;
    private double height;

    public WithTwoDimensionalBase(T base, double height) {
        setBase(base);
        setHeight(height);
    }

    @Override
    double calculateSurfaceArea() {
        return 0;
    }

    @Override
    double calculateVolume() {
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }
}
