/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.customer;
import java.util.*;
/**
 *
 * @author student
 */
public class Customer 
{
    String data;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        
        System.out.println("Enter customer Name and DOB (DD:MM:YYY):");
        data =sc.next();
    }
    
    void display()
    {
        StringTokenizer st=new StringTokenizer(data,"/");
        System.out.println("Customer DATA is :");
        while(st.hasMoreTokens())
        {
            String val=st.nextToken();
            System.out.print(val);
            if(st.countTokens()!=0)
                System.out.print(","+" ");
            
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the no. customers\n");
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        Customer ob[]=new Customer[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Customer();
                ob[i].read();
                ob[i].display();

        }
    }
}
