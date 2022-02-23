package Main;

import Shape.*;

public class Main {

    public static void main(String[] args) {
        Triangle myObj = new Triangle(3,4,3);
        System.out.printf("%.2f", myObj.calculatePerimeter());
        System.out.println();
        System.out.printf("%.2f", myObj.calculateArea());
    }
}
