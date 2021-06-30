package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year:");
        year = scanner.nextInt();
        boolean leapYear = false;

        boolean dividedBy4 = year % 4 == 0;
        if (dividedBy4) {
            boolean dividedBy100 = year % 100 == 0;
            if (dividedBy100) {
                boolean dividedBy400 = year % 400 == 0;
                if (dividedBy400) {
                    leapYear = true;
                }
            }
        } else {
            leapYear = true;
        }

        if (leapYear) {
            System.out.printf("%d is not a leap year!", year);
        } else {
            System.out.printf("%d is a leap year", year);
        }

    }
}
