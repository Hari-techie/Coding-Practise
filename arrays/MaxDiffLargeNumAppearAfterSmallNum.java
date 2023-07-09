package arrays;
import java.util.*;
/*
Input : arr = {2, 3, 10, 6, 4, 8, 1}
Output : 8
Explanation : The maximum difference is between 10 and 2.

Input : arr = {7, 9, 5, 6, 3, 2}
Output : 2
Explanation : The maximum difference is between 9 and 7.
*/
public class MaxDiffLargeNumAppearAfterSmallNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n=sc.nextInt();
        int a[] =new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int mx=a[1]-a[0],mn=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]-mn>mx)
            {
                mx=a[i]-mn;
            }
            if(a[i]<mn)
            {
                mn=a[i];
            }
        }
        System.out.println(mx);
    }
}
/*
static int maxDiff(int arr[], int n)
{
    // Initialize Result
    int maxDiff = -1;
     
    // Initialize max element from right side
    int maxRight = arr[n-1];
 
    for (int i = n-2; i >= 0; i--)
    {
        if (arr[i] > maxRight)
            maxRight = arr[i];
        else
        {
            int diff = maxRight - arr[i];
            if (diff > maxDiff)
            {
                maxDiff = diff;
            }
        }
    }
    return maxDiff;
}
*/