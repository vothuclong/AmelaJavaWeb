package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};
        int[] C = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
        System.out.println("Mang C sau khi gop 2 mang A va B: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + "\t");
        }
    }
}