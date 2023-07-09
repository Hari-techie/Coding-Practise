package arrays;
import java.util.*;
public class Reverse_Array_KSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i=i+k)
        {
            int left = i;
            int right = Math.min(i+k-1,n-1);
             if(i==n-k)break;
            while(left<right)
            {
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++;
                right--;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
