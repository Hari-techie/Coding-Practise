package arrays.pattern;
import java.util.*;
/*
     1
    232
   45654
*/
public class p1 {
    public static void main(String[]args)
    {
     int n=3,i,j,k,c=0;
    for(i=1;i<=n;i++)
    {
        for(k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=(2*i)-1;j++)
        {
            if(j<=i)
            {
            System.out.print(++c);
            }
            else
            {
                System.out.print(--c);
            }
        }
        c+=i-1;
        System.out.print("\n");
    }
    }
}
