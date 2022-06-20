/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pro5mergesort;

import java.util.*;

public class Pro5MergeSort {

    public void mergeSort(int[] a, int n) {

        if (n > 1) {
            int mid = n / 2;
            int[] b = new int[mid];
            int[] c = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                b[i] = a[i];
            }

            for (int j = mid; j < n; j++) {
                c[j - mid] = a[j];
            }

            mergeSort(b, mid);
            mergeSort(c, n - mid);

            merge(a, b, c, mid, n - mid);
        }
    }

    void merge(int[] a, int[] b, int[] c, int p, int q) {
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (b[i] <= c[j]) {
                a[k++] = b[i++];
            } else {
                a[k++] = c[j++];
            }
        }
        while (i < p) {
            a[k++] = b[i++];
        }
        while (j < q) {
            a[k++] = c[j++];
        }
    }

    public static void main(String[] args) {
        Pro5MergeSort m = new Pro5MergeSort();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter the size of array :-");
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = r.nextInt(5000);
        }

        double startTime = System.nanoTime();
                 m.mergeSort(a, size);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("Time taken is " + duration + " milliseconds");
    }
}
