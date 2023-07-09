package arrays.pattern;
import java.util.*;
/*
Example Input/Output 1:
Input:
4

Output:
1020304017018019020
**50607014015016
****809012013
******10011
Example Input/Output 2:
Input:
3

Output:
10203010011012
**4050809
****607

*/
public class p3 {
    public static void main(String[]args)
    {
     int i,j,k,a=10,e=0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter n value : ");
     int n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
         e+=i;
     }
     e=((e*2)-n)*10+10;
     int t=e,d=n;
     for(i=1;i<=n;i++)
     {
         for(j=1;j<i;j++)
         {
              System.out.print("**");
         }
         for(k=i;k<=n;k++)
         {
              System.out.print(a);
              a+=10;
         }
         for(j=i;j<=n;j++)
         {   
             if(j==i)
             {
                 t=e;
             }
             if(j==n)
             {
                  System.out.print(e/10);
             }
             else
             {
              System.out.print(e);
             }
              e+=10;
         }
         System.out.print("\n");
         d-=1;
         e=t-(d*10);
     }
    }
}
