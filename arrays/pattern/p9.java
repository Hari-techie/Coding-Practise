package arrays.pattern;
/*

Input : n = 4
Output :
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

Input : n = 3
Output :
3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
 
*/
import java.util.*;
public class p9 {
    static void print(int n)
    {
        int i,j,spc,k;
        for(i=n;i>=1;i--)
        {
            for(spc=n;spc>=i+1;spc--)
            {
                System.out.print(spc+" ");
            }
            for(j=1;j<=(2*i)-1;j++)
            {
                System.out.print(i+" ");
            }
            for(k=i+1;k<=n;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
        for(i=2;i<=n;i++)
        {
            for(spc=n;spc>=i+1;spc--)
            {
                System.out.print(spc+" ");
            }
            for(j=1;j<=(2*i)-1;j++)
            {
                System.out.print(i+" ");
            }
            for(k=i+1;k<=n;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //print(n);
        int size = (2*n)-1;
        int a[][] = new int[size][size];
        int i,j;
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                a[i][j] = Math.max(Math.abs(i-size/2),Math.abs(j-size/2))+1;
            }
        }
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
