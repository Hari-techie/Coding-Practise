package arrays;
import java.util.*;
/*
           4 9 7 11 2
   i=0 --> 4 7 9 2 11
   i=1 --> 4 7 2 9 11
   i=2 --> 4 2 7 9 11
   i=3 --> 2 4 7 9  11
   i=4 -->
*/
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
