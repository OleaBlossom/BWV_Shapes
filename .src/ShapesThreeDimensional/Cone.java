package ShapesThreeDimensional;

import ShapesTwoDimensional.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;

public class Cone extends Pyramid<Circle> {

    public Cone(Circle base, double height) {
        super(base, height);
    }

    @Override
    public double calculateLateralSurfaceArea() throws TypeCheckError {
        // π x r x √(r² + h²)
        double radius = getBase().getRadius();
        return Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public double calculateSurfaceArea() throws TypeCheckError {
        return getBase().calculateArea() + calculateLateralSurfaceArea();
    }

    @Override
    public double calculateVolume() throws TypeCheckError {
        // (πr2h)/3
        return (Math.PI * Math.pow(getBase().getRadius(), 2) * getHeight()) / 3;
    }

    @Override
    public Circle getBase() throws TypeCheckError {
        ShapeTwoDimensional b = super.getBase();
        if (b instanceof Circle) {
            return (Circle) b;
        } else {
            throw new TypeCheckError("oops, that's not a circle", b);
        }
    }

    @Override
    public void setBase(Circle base) {
        super.setBase(base);
    }
}
