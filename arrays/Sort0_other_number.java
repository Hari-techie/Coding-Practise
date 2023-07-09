package arrays;
import java.util.*;
public class Sort0_other_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=n-1;
        for(i=0;i<n/2;i++)
        {
            if(a[i]==0)
            { 
                int t = a[l];
                a[l]=0;
                a[i]=t;
                l--;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
