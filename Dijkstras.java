/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.dijkstras;

import java.util.*;

/**
 *
 * @author student
 */
public class Dijkstras {

    static int cost[][] = new int[20][20];
    static int d[] = new int[20];
    static int visited[] = new int[20];
    static int i, j, min, u, w;

    static void dij(int source, int[][] cost, int[] visited, int[] d, int n) {
        for (i = 1; i <= n; i++) {
            visited[i] = 0;
            d[i] = cost[source][i];

        }
        visited[source] = 1;
        d[source] = 0;
        for (j = 2; j <= n; j++) {
            min = 999;
            for (i = 1; i <= n; i++) {
                if (visited[i] != 1) {
                    if (d[i] < min) {
                        min = d[i];
                        u = i;
                    }
                }
            }
            visited[u] = 1;

            for (w = 1; w <= n; w++) {
                if (cost[u][w] != 999 && visited[w] == 0) {
                    if (d[w] > cost[u][w] + d[u]) {
                        d[w] = cost[u][w] + d[u];
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        int i, j, n, source;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertices: ");
        n = sc.nextInt();
        System.out.println("Enter the cost adjacency matrix: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter the source node: ");
        source = sc.nextInt();
        dij(source, cost, visited, d, n);
        for (i = 1; i <= n; i++) {
            if (i != source) {
                System.out.println("\nShortest path from " + source + " to " + i + " is " + d[i]);
            }
        }

    }
}
