package Shape;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        setSideA(a);
        setSideB(b);
        setSideC(c);
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
        this.sideA = Math.abs(sideA);
    }

    public void setSideB(double sideB) {
        this.sideB = Math.abs(sideB);
    }

    public void setSideC(double sideC) {
        this.sideC = Math.abs(sideC);
    }
}
