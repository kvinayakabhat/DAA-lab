/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.staffdetails;
import java.util.Scanner;
/**
 *
 * @author student
 */
class Staff{
    String staffid,name;
    long phone;
    int salary;
    
}
class Teaching extends Staff
{
    String domain;
    int pub;
        //contructor name and class name should be same
                Teaching (String si,String n,long p,int s,String d, int pu)
                {
                    staffid = si;
                    name = n;
                    phone = p;
                    salary = s;
                    domain = d;
                    pub = pu;
                }
void display_teaching()
{
    System.out.println(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t"+domain+"\t"+pub+"\t");
}
}


class Technical extends Staff
{
    String skill;
    Technical (String si,String n,long p,int s,String sk)
    {
                    staffid = si;
                    name = n;
                    phone = p;
                    salary = s;
                    skill =sk;
    }
    void display_technical()
{
    System.out.println(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t"+skill+"\t");
}
}


class Contract extends Staff
{
    int period;
    Contract (String si,String n,long p,int s,int pr)
    {
                    staffid = si;
                    name = n;
                    phone = p;
                    salary = s;
                    period =pr;
    }
    void display_technical()
{
    System.out.println(staffid+" "+name+" "+phone+" "+salary+" "+period+" ");
}

    void display_contract() {
        System.out.println(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t"+period+"\t");
    }
}
public class StaffDetails {

    public static void main(String[] args) {
        int choice;
        Scanner scn = new Scanner(System.in);
        for(;;)
        {
            System.out.println("1.Teaching\n2.Technical\n3.Contract\n4.Exit\nEnter your choice");
            choice =scn.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the number of teaching staff ");
                       int n =scn.nextInt();
                       Teaching s[]=new Teaching[n];
                       System.out.println("Enter teaching staff details: ID Name Phone Salary Domain Publications ");
                       for(int i=0;i<n;i++)
                       {
                           String si = scn.next();
                           String name =scn.next();
                            long ph = scn.nextLong();
                            int sal = scn.nextInt();
                            String dom = scn.next();
                            int pub = scn.nextInt(); 
                            s[i]= new Teaching(si,name,ph,sal,dom,pub);
                       }
                        System.out.println("SId\tName\tPhone\t     Salary\tDomain\tPublications");
                        for(int i=0;i<n;i++)
                            {
                            s[i].display_teaching();
                            }
                        break;
                        
                case 2:System.out.println("Enter the number of technical staff ");
                       int m =scn.nextInt();
                       Technical T[]=new Technical[m];
                       System.out.println("Enter technical staff details: ID Name Phone Salary Skills");
                       for(int i=0;i<m;i++)
                       {
                           String sid = scn.next();
                          String names =scn.next();
                            long pho = scn.nextLong();
                            int sala = scn.nextInt();
                            String skill =scn.next();
                            T[i]= new Technical(sid,names,pho,sala,skill);
                       }
                        System.out.println("SId\tName\tPhone\tSalary\tSkills");
                        for(int i=0;i<m;i++)
                            {
                            T[i].display_technical();
                            }
                        break;
                case 3:System.out.println("Enter the number of contract staff ");
                       int c =scn.nextInt();
                       Contract Q[]=new Contract[c];
                       System.out.println("Enter contract staff details: ID Name Phone Salary Period");
                       for(int i=0;i<c;i++)
                       {
                           String sti = scn.next();
                          String nam =scn.next();
                            long phon = scn.nextLong();
                            int salar = scn.nextInt();
                            int peri =scn.nextInt();
                            Q[i]= new Contract(sti,nam,phon,salar,peri);
                       }
                        System.out.println("SId\tName\tPhone\tSalary\tPeriod");
                        for(int i=0;i<c;i++)
                            {
                            Q[i].display_contract();
                            }
                        break;  
                case 4:return;        
                        
                       
                       
            }
        }
        /*Teaching t1[] = new Teaching[3];
        for(int i=0;i<3;i++)
        {
          String name =sc.next();
          String sid = sc.next();
          long ph = sc.nextLong();
          int sal = sc.nextInt();
          String dom = sc.next();
          int pub = sc.nextInt();
          
        }*/
    }
}

    