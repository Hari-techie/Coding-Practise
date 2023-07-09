package demo;
import java.util.*;
/*
12345
 123
  1
 321
54321

i/p : 9
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 
    1 2 3 4 5 
      1 2 3 
        1 
      3 2 1 
    5 4 3 2 1 
  7 6 5 4 3 2 1 
9 8 7 6 5 4 3 2 1 
*/
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,n=9;
        for(i=0;i<n/2;i++)
        {
            for(k=1;k<i+1;k++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=n-(2*i);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        for(i=n/2;i>=0;i--)
        {
            for(k=1;k<i+1;k++)
            {
                System.out.print("  ");
            }
            for(j=n-(2*i);j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}

