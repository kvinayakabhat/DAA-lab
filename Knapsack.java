/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.knapsack;
import java.util.*;
/**
 *
 * @author student
 */
public class Knapsack {
    static int n,p;
    static int w[]=new int[20];
    static int c[]=new int[20];
    static int v[][]=new int[20][20];
    static int knapsack(int n,int p)
    {
        int value;
        if(v[n][p]<0)
        {
            if(p-w[n]<0)
                value=knapsack(n-1,p);
            else
                value=max(knapsack(n-1,p),(c[n]+knapsack(n-1,p-w[n])));
            v[n][p]=value;
        }
        return v[n][p];
    }
    static int max(int a,int b)
    {
        if(a>b)
            return a;
        else 
            return b;
        
        
    }
    
    static void knaps()
    {
        int i,j;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=p;j++)
            {
                if(i==0 || j==0)
                    v[i][j]=0;
                else
                    v[i][j]=-1;
            }
        }
    }

    public static void main(String[] args) 
    {
        int d,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of items: \n");
        n=sc.nextInt();
        System.out.println("\nEnter the capacity: \n");
        p=sc.nextInt();
        System.out.println("\nEnter the weights: \n");
        for(i=1;i<=n;i++)
            w[i]=sc.nextInt();
        System.out.println("\nEnter the cost: \n");
        for(i=1;i<=n;i++)
            c[i]=sc.nextInt();
        knaps();
        d =knapsack(n,p);
        System.out.println("\nThe optimal solution is: "+d);
    }
}
