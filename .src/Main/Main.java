package Main;

import ShapesTwoDimensional.*;
import ShapesThreeDimensional.*;

public class Main {

    public static void main(String[] args) {
        debugSphere();
    }

    static void debugSphere() {
        Sphere sphere = new Sphere(5);
        System.out.println(sphere.calculateSurfaceArea());
        System.out.println(sphere.calculateVolume());
    }

    static void debugTriangles() {
        Triangle myObj = new Triangle(3,4,-3);
        System.out.printf("%.2f", myObj.calculatePerimeter());
        System.out.println();
        System.out.printf("%.2f", myObj.calculateArea());

        System.out.println();

        Triangle myObj2 = new Triangle(2, 3, 6);
        System.out.printf("%.2f", myObj2.calculatePerimeter());
        System.out.println();
        System.out.printf("%.2f", myObj2.calculateArea());
    }
}
