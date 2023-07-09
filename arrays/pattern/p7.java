package arrays.pattern;
import java.util.*;

public class p7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,r=1,k,j,n = sc.nextInt();
        String t;
        for(i=1;i<=n;i++)
        {
            for(k=0;k<n-i;k++)
            {
                 System.out.print(" ");
            }
            if(i==1)
            {
                 System.out.print(r+" ");
            }
            else
            {
            r=r*11;
            t=Integer.toString(r);
            for(j=0;j<i;j++)
            {
                System.out.print(t.charAt(j)+" ");
            }
            }
            System.out.println();
        }
   
    }
  
}
