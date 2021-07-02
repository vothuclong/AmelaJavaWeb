package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Circle Test-----\n");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5, "red");
        System.out.println(circle);
        System.out.printf("Circle Area = %.2f", circle.getArea() );
        System.out.printf("\nCircle Perimeter = %.2f", circle.getPerimeter());

        System.out.println("-----Cylinder Test-----\n");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5, "blue", 3.5);
        System.out.println(cylinder);
        System.out.printf("Cylinder Area = %.2f", cylinder.getArea());
        System.out.printf("\nCylinder Volume =  %.2f", cylinder.getVolume());
    }
}