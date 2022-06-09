/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.student;//takes input from the user



import java.util.Scanner;

/**
 *
 * @author student
 */
public class Student 
{

    String name;
    String usn;
    String branch;
    Long phone;

    void insertRecord(String n, String u, String b, long p)
    {
        name = n;
        usn = u;
        branch = b;
        phone = p;
    }

    void displayRecord() 
    {
        System.out.println(name + " " + usn + " " + branch + " " + phone);
    }



    public static void main(String[] args)
{
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    n=sc.nextInt();
    Student st[]=new Student[n];
    int i;
    for(i=0;i<n;i++)
       {
           st[i]=new Student();
           
       }
    for(i=0;i<n;i++)
       {
           System.out.println("Enter the details of the student:"+(i+1));
        String nn=sc.next();
        String uu=sc.next();
        String bb=sc.next();
        long pp=sc.nextLong();
        st[i].insertRecord(nn,uu,bb,pp);
        }
        for(i=0;i<n;i++)
            {
                st[i].displayRecord();
            }
    }
}
