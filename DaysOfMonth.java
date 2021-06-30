package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month? ");
        int month = scanner.nextInt();
        String days;
        switch (month) {
            case 2:
                days = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30";
                break;
            default:
                days = "";
                break;
        }

        if (days != "") {
            System.out.printf("The month %d has %s days", month, days);
        } else
            System.out.print("Invalid Input");
    }
}
