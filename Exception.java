/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exception;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Exception {

    public static void main(String[] args) {
        int a,b,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input two integers");
        a = sc.nextInt();
        b=sc.nextInt();
        try
        {
           result =a/b;
           System.out.println("Result ="+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught: Divide by zero error"+e);
        }
        
    }
}
