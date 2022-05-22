package ShapesThreeDimensional;

import ShapesTwoDimensional.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;

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

    public ShapeTwoDimensional getBase() throws TypeCheckError {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }


    @Override
    public double calculateSurfaceArea() throws TypeCheckError {
        return 0;
    }

    @Override
    public double calculateVolume() throws TypeCheckError {
        return 0;
    }
}
