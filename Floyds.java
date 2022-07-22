/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.floyds;
import java.util.*;

/**
 *
 * @author student
 */
public class Floyds {
    static int cost[][]=new int[20][20];
    static int A[][]=new int[20][20];
    static int min(int a,int b)
    {
        if(a<b)
            return a;
        else 
            return b;
        
    }
    
    public static void main(String arg[])
    {
        int n,i,j,min,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of vertices: ");
        n=sc.nextInt();
        System.out.println("Enter the cost adjacency matrix: ");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                A[i][j]=sc.nextInt();
                
            }
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=A[i][j];
            }
        }
        for(k=1;k<=n;k++)
        {
            for(j=1;j<=n;j++)
            {
                for(i=1;i<=n;i++)cost[i][j]=min(cost[i][j],cost[i][k]+cost[k][j]);
            }
        }
    


    System.out.println("Transitive closer graph: ");
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            System.out.print(cost[i][j]+"\t");
        }
        System.out.println();
    }
    }
}


    