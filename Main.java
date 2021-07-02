package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Point2D-----");
        Point2D point2D  = new Point2D(2,3.5f);
        float[] arr = point2D.getXY();
        System.out.println("X, Y value are");
        for(float p : arr)
            System.out.print(p + "\t");
        System.out.println("\n" + point2D.toString() + "\n");

        System.out.println("-----Point3D-----");
        Point3D point3D = new Point3D(1.5f,2,3.7f);
        arr = point3D.getXYZ();
        System.out.println("X, Y, Z value are");
        for(float p : arr)
            System.out.print(p + "\t");
        System.out.println("\n" + point3D.toString());
    }
}