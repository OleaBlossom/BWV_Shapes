package Main;

import Shape.*;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        Triangle myObj = new Triangle(2, 3, 6);
        System.out.printf("%.2f", myObj.calculatePerimeter());
        System.out.println();
        System.out.printf("%.2f", myObj.calculateArea());
    }
}
