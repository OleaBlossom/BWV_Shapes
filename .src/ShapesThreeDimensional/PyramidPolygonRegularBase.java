package ShapesThreeDimensional;

import ShapesTwoDimensional.*;

public class PyramidPolygonRegularBase extends Pyramid<PolygonRegular> {

    public PyramidPolygonRegularBase(PolygonRegular base, double height) {
        super(base, height);
    }

    @Override
    public double calculateLateralSurfaceArea() {
        // 1/2 * perimeter of base * slant height of pyramid (= √ h^2 + r^2)
        double perimeter = getBase().calculatePerimeter();
        double radius = getBase().calculateIncircleRadius();
        double slantHeight = Math.sqrt((Math.pow(getHeight(), 2) + Math.pow(radius, 2)));

        return perimeter * slantHeight / 2;
    }

    @Override
    public double calculateVolume() {
        // 1/3 * base area * height
        return getBase().calculateArea() * getHeight() / 3;
    }
}
