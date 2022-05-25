package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public class RightPrism<T extends ShapeTwoDimensional> implements ShapeThreeDimensional {
    private T base;
    private double height;

    public RightPrism(T base, double height) {
        setBase(base);
        setHeight(height);
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


    @Override
    public double calculateSurfaceArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
