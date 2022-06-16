/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quicksort;
import java.util.*;


/**
 *
 * @author student
 */
public class QuickSort {
    static int a[]=new int [10000];
    static void quicksort(int a[],int low,int high)
    {
        int j;
        if(low<high)
        {
            j=partition(a,low,high);
            quicksort(a,low,j-1);
            quicksort(a,j+1,high);
            
        }
    }
    
    static int partition(int a[],int low,int high)
    {
        int pivot,i,j,temp;
        pivot=a[low];
        i=low+1;
        j=high;
        while(true)
        {
            while(pivot>a[i] && i<=high)
                i++;
            while(pivot<a[j])
                j--;
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else
            {
                temp=a[j];
                a[j]=a[low];
                a[low]=temp;
                return j;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=sc.nextInt();
        int i;
        
        System.out.println("Random numbers generated are: ");
        Random r=new Random();
        for(i=0;i<n;i++)
        {
            a[i]=r.nextInt(10000);
            System.out.println(a[i]);
        }
        
        long startTime=System.nanoTime();
        quicksort(a,0,n-1);
        double endTime=System.nanoTime();
        double duration=(endTime-startTime);
        System.out.println("\nElements after sorting ");
        for(int k=0;k<n;k++)
            System.out.print(a[k]+" ");
        System.out.println();
        double milliseconds=duration/1000000;
        System.out.println("Total time taken to sort the numbers is: "+milliseconds+"milliseconds");
    }
}
