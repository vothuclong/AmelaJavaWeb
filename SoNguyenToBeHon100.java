package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 2;
        while (number <= 100) {
            if (number == 2) {
                System.out.println(number);
                number++;
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
                    System.out.println(number);
                    number++;
                } else {
                    number++;
                }
            }
        }
    }
}