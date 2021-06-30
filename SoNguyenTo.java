package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 2) {
            System.out.print(number + " la so nguyen to");
        } else {
            int i = 2;
            boolean checkSoNguyenTo = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    checkSoNguyenTo = false;
                    break;
                } else {
                    i++;
                }
            }
            if (checkSoNguyenTo) {
                System.out.print(number + " la so nguyen to");
            } else {
                System.out.print(number + " khong phai la so nguyen to");
            }
        }
    }
}