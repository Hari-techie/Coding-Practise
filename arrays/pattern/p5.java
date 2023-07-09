package arrays.pattern;
/*
5
5 10 15 20 25 
50 45 40 35 30 
55 60 65 70 75 
100 95 90 85 80 
105 110 115 120 125
*/
import java.util.*;
public class p5 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,count=1,n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[j]=count*n;
                count++;
            }
            if(i%2==0)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[j]+" ");
                }
            }
            else
            {
                for(j=n-1;j>=0;j--)
                {
                    System.out.print(a[j]+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
