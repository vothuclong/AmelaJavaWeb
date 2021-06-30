package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong, soCot;
        System.out.print("Nhap so dong cua ma tran: ");
        soDong = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        soCot = scanner.nextInt();
        int[][] matrix = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhap phan tu tai vi tri: [" + i + "," + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat cua ma tran: " + max);
    }
}