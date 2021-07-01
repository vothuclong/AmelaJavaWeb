package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double height = scanner.nextDouble();
        Rectangle hinhChuNhat = new Rectangle(width, height);
        System.out.println("Hinh chu nhat: " + hinhChuNhat.display());
        System.out.println("Chu vi hinh chu nhat: " + hinhChuNhat.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + hinhChuNhat.getArea());
    }
}