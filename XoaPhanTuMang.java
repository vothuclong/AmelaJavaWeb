package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Mang truoc khi xoa phan tu la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        boolean check = false;
        int index_del = 0;
        for (int i = 0; i < array.length ; i++) {
            if (x == array[i])
            {
                check = true;
                index_del = i;
                break;
            }
        }
        if (!check) {
            System.out.println("Phan tu can xoa khong trung khop");
            return;
        }
        for (int i = index_del; i < array.length - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = array[i];
        }
        array[array.length - 1] = 0;
        System.out.println("Mang sau khi xoa phan tu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
    }
}