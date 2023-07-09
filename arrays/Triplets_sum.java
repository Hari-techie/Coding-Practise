package arrays;
import java.util.*;
public class Triplets_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int mx1=0,mx2=0,mx3=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>mx1)
            {
               mx3 = mx2;
               mx2 = mx1;
               mx1 = a[i];
            }
            else if(a[i]>mx2)
            {
                mx3 = mx2;
                mx2 = a[i];
            }
            else if(a[i]>mx3)
            {
                mx3 = a[i];
            }
        }
        System.out.println((mx1+mx2+mx3));
    }
}
