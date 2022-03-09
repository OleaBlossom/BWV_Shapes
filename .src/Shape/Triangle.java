package Shape;

public class Triangle
        extends ShapeTwoDimensional {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) throws IllegalArgumentException {
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        boolean isValid = validate(a, b, c);

        if (isValid) {
            setSideA(a);
            setSideB(b);
            setSideC(c);
        } else {
            throw new IllegalArgumentException("the sum of the lengths of any two sides of a triangle has to be greater than the length of the third side");
        }
    }

    private static boolean validate(double a, double b, double c) {
        return (a + b) > c
                && (b + c) > a
                && (c + a) > b;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        double areaResult = (s - sideA) * (s - sideB) * (s - sideC);
        areaResult = s * areaResult;
        areaResult = Math.sqrt(areaResult);

        return areaResult;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
