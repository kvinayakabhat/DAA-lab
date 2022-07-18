/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kruskal;
import java.util.*;


/**
 *
 * @author student
 */
public class Kruskal {
    static int i,j,k,a,b,v,u,n,ne=1;
    static int min,mincost=0;
    static int cost[][]=new int[10][10];
    static int parent[]=new int[10];
    static int find(int i)
    {
        while(parent[i]!=0)
            i=parent[i];
        return i;
    }
    static void uni(int i,int j)
    {
        if(i<j)
            parent[i]=j;
        else
            parent[j]=i;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Implementation of krushkal's algorithm");
        System.out.println("Enter the number of vertices");
        n=sc.nextInt();
        System.out.println("Enter the cost of adjacency matrix");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=sc.nextInt();
                if(cost[i][j]==0)
                    cost[i][j]=999;
            }
        }
        System.out.println("The edges of minimum cost spanning tree are");
        while(ne<n)
        {
            for(i=1,min=999;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                  if(cost[i][j]<min)
                {
                    min=cost[i][j];
                    a=u=i;
                    b=v=j;
                }
            }
        }
        u=find(u);
        v=find(v);
        if(u!=v)
        {
            uni(u,v);
                    System.out.println("edge"+(ne++)+"("+a+"->"+b+")"+min);
                    mincost+=min;
        }
        else
        {
            cost[a][b]=cost[b][a]=999;
        }
        }
        System.out.println("minimum cost="+mincost);
        }
    }

