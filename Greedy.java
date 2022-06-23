/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.greedy;
import java.util.Scanner;

class KObject
{
    float w;
    float p;
    float r;
}



/**
 *
 * @author student
 */
public class Greedy
{
    static final int MAX=20;
    static int n;
    static float M;
    
    

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no. of objects:");
        n=sc.nextInt();
        KObject[] obj=new KObject[n];
        for(int i=0;i<n;i++)
            obj[i]=new KObject();
        ReadObjects(obj);
        Knapsack(obj);
        sc.close();
        
    }
    
    static void ReadObjects(KObject obj[])
    {
        KObject temp=new KObject();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max capacity of knapsack: ");
        M=sc.nextFloat();
        System.out.println("Enter weights:");
        for(int i=0;i<n;i++)
            obj[i].w=sc.nextFloat();
        
            System.out.println("Enter profits: ");
        for(int i=0;i<n;i++)
            obj[i].p=sc.nextFloat();
        for(int i=0;i<n;i++)
            obj[i].r=obj[i].p/obj[i].w;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1-i;j++)
                if(obj[j].r<obj[j+1].r)
                {
                    temp=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=temp;
                }
        sc.close();
            
        
    }
    
    static void Knapsack(KObject kobj[])
    {
        float x[]=new float[MAX];
        float totalprofit =0;
        int i;
        float U;
        U=M;
                
        for(i=0;i<n;i++)
            x[i]=0;
        for(i=0;i<n;i++)
        {
            if(kobj[i].w>U)
                break;
            else
            {
                x[i]=1;
                totalprofit=totalprofit+kobj[i].p;
                U=U-kobj[i].w;
                
            }
        }
        
        System.out.println("i="+i);
        if(i<n)
            x[i]=U/kobj[i].w;
        totalprofit=totalprofit+(x[i]*kobj[i].p);
        System.out.println("The solution vector,x[]:");
        for(i=0;i<n;i++)
            System.out.println(x[i]+" ");
        System.out.println("\nTotal profit is ="+totalprofit);
            
        
    }
}
