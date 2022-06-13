/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.mycompany.javaexception;
import java.util.Random;

/**
 *
 * @author student
 */
class Square extends Thread
{
    public int num;
    Square(int n){
        num =n; //random number n will be passed as a parameter to the constructor
    }
    public void run()
    {
        System.out.println("Square of the randomly generated number = "+(num*num));
    }
}
        
        
    
class Cube extends Thread
{
        public int num;
        Cube(int n){
            num = n;
        }
        public void run()
    {
       System.out.println("Cube of the randomly generated number = "+(num*num*num)); 
    }
        
}
        
class JavaException extends Thread
{
    public void run()
    {
        //int num= 0;
        Random r =new Random();
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("_____________________________");
                int num=r.nextInt(10);
                System.out.println("Random number generated is "+ num);
                Square s=new Square(num);
               Cube c=new Cube(num);
                s.start();
                c.start();
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            
            }
        }
    
    public static void main(String args[])
    {
        JavaException j=new JavaException();
        j.start();
    }
}
    /*public void run()
    {
       System.out.println("Square of the randomly generated number = "+(num*num*num)); 
    }*/
