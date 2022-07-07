/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prims;
import java.util.*;

/**
 *
 * @author student
 */
public class Prims {
    static int ne=1,min_cost=0;
    static int cost[][]=new int[20][20];
    static int d[]=new int[20];
    static int visited[]=new int[20];
    static int v,u,a,b;
    

    public static void main(String[] args) {
        int n,i,j,min,source;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices: ");
        n=sc.nextInt();
        
        System.out.println("Enter the cost adjacency matrix: ");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=sc.nextInt();
            }
        }
        for(i=1;i<=n;i++)
            visited[i]=0;
        System.out.println("Enter the root node: ");
        source=sc.nextInt();
        visited[source]=1;
        System.out.println("\nMinimum cost spanning tree is\n");
        while(ne<n)
        {
            min=999;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(cost[i][j]<min)
                        if(visited[i]==0)
                            continue;     //do nothing carry on the next iteration
                    else
                        {
                            min=cost[i][j];
                            a=u=i;
                            b=v=j;
                            
                        }
                }
            }
            if(visited[u]==0||visited[v]==0)
            {
                System.out.println("\nEdge"+ne++ +"\t"+a+"->"+b+"="+min);
                min_cost=min_cost+min;
                visited[b]=1;
            }
            cost[a][b]=cost[b][a]=999;
        }
        System.out.println("\nMinimum cost="+min_cost);
    }
}
