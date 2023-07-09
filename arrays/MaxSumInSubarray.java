/*
Sliding window technique
    Given an array of integers of size ‘n’.
Our aim is to calculate the maximum sum of ‘k’ 
consecutive elements in the array.

Input  : arr[] = {100, 200, 300, 400}
         k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
         k = 4 
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23}
of size 4.

Input  : arr[] = {2, 3}
         k = 3
Output : Invalid
There is no subarray of size 3 as size of whole
array is 2.
*/
package arrays;
import java.util.*;
public class MaxSumInSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0,mxsum=0;
        for(i=0;i<k;i++)
        {
            sum+=a[i];
        }
        mxsum=sum;
        for(i=k;i<n;i++)
        {
            sum=sum+a[i]-a[i-k];
            mxsum = Math.max(sum, mxsum);
        }
        System.out.println(mxsum);
    }
}
