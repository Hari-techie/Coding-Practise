package string;
import java.util.*;
import java.io.*;
 public class FirstOccOf2ndStrCharIn1stStr 
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String s = sc.nextLine();
         String t = sc.nextLine();
         char a[] = s.toCharArray();
         char b[] = t.toCharArray();
         int i,n = b.length,m = a.length;
         HashMap<Character,Integer>h = new HashMap<>();
         for (i=0;i<m;i++)
         {
             if(h.get(a[i])==null)
             {
                 h.put(a[i],i);
             }
         }
         for(i=0;i<n;i++)
         {
             if(h.get(b[i])!=null)
             {
                  System.out.println(b[i]+" "+h.get(b[i]));
             }
         }
     }
 }