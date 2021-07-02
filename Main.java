package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-----Test Point Class-----\n");
        Point point = new Point(2.3f, 2.5f);
        System.out.println(point.toString() + "\n");

        System.out.println("\n-----Test moveablePoint Class-----\n");
        moveablePoint move = new moveablePoint(2,3,1,1.5f);
        System.out.println(move);
        move.move();
        System.out.println(move);
    }
}