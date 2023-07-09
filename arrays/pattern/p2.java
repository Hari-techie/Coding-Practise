package arrays.pattern;
import java.util.*;
/*
Example Input/Output 1:
Input:
5

Output:
1 6 10 13 15
2 7 11 14
3 8 12
4 9
5

Example Input/Output 2:
Input:
3

Output:
1 4 6
2 5
3
*/
public class p2 {
    public static void main(String[]args)
    {
     int i,j,p;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter n value : ");
     int n=sc.nextInt();
     for(i=1;i<=n;i++) //1
     {
         p=i;
         for(j=n;j>=i;j--)// 5 4 3 2 1
         {   
             System.out.print(p+" ");
             p+=j;
         }
         System.out.print("\n");
     }
    }
}
