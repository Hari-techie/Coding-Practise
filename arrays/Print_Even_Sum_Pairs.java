package arrays;
import java.util.*;
import java.io.*;
/*
7
0 2 5 3 2 4 1
op;
0,2
0,4
2,2
2,4
5,3
5,1
3.1
*/
 public class Print_Even_Sum_Pairs 
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
         {
             a[i] = sc.nextInt();
         }
         int i=0,j=0;
         LinkedHashSet<String> h = new LinkedHashSet<>();
         for(i=0;i<n;i++)
         {
             for(j=i+1;j<n;j++)
             {
                 if((a[i]+a[j])%2==0)
                 {
                     h.add("("+String.valueOf(a[i])+","+String.valueOf(a[j]+")"));
                     //System.out.println(a[i]+","+a[j]);
                 }
             }
         }
         System.out.println(h);
     }
 }