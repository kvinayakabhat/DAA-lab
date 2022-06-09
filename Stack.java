/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stack;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Stack
{
	final int max=5;                         //declare like this or directly
	int s[]=new int[max];                   //new is malloc
	int top=-1;
	void push(int ele)                  //returns nothing
	{
                                        //top = top+1;
                                        //s[top]=ele;
		if(top>=max-1)
			System.out.println("Stack overflow");
		else
			s[++top]=ele;
	}
	int pop()                       //return the deleted value ..no parameter req
	{
                                    
                int z=0;
		if(top==-1)
			System.out.println("Stack underflow");
                

                else
                         //return s[top--];
                                    z=s[top--];
                                return z;
                
	}
	void display()
	{
		if(top==-1)
			System.out.println("Stack empty");
		else
		{
                       System.out.println("Elements in the stack are");
			for(int i=top;i>-1;i--)
			System.out.println(s[i]+" ");
		}
	}

public static void main(String args[])
{
	int q=1;
	Stack m = new Stack();                   //instantiate stack class
	System.out.println("program to perform stack operations");
	Scanner sc=new Scanner(System.in);          //instantiate
	while(q!=0)                             //boolean variable..not true = continues
	{
		System.out.println("1. Push \t2.Pop \t3. Display \t4.Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter the element to be pushed");
				int ele=sc.nextInt();  //assign the new value to stack 
				m.push(ele);           //perform the function
				break;
			case 2: 
				int nump;
				nump=m.pop();
                                
                                
				System.out.println("The poped element is");
				System.out.println(nump+" ");
				break;
			case 3:
				//System.out.println("Elements in the stack are");
				m.display();
				break;
			case 4:
				q=0;
		}
	}
}
} 














