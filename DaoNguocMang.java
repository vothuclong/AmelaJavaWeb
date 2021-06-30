package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Nhap vao gia tri thu " + (i + 1) + " cua mang: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang da nhap la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[20 - 1 - j];
            array[20 - 1 - j] = temp;
        }
        System.out.println("\n" + "Mang sau khi dao nguoc la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}