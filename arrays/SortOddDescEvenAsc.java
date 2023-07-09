package arrays;
import java.util.*;
/*
Input  : arr[] = {1, 2, 3, 5, 4, 7, 10}
Output : arr[] = {7, 5, 3, 1, 2, 4, 10}

Input  : arr[] = {0, 4, 5, 3, 7, 2, 1}
Output : arr[] = {7, 5, 3, 1, 0, 2, 4} 
*/
import java.util.Arrays;
public class SortOddDescEvenAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if((a[i] & 1) == 1)
            {
                a[i]=a[i]*-1;
            }
        }
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            if((a[i] & 1)== 1)
            {
                a[i]=a[i]*-1;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
/*
 static void twoWaySort(Integer arr[], int n)
    {
        // Current indexes from left and right
        int l = 0, r = n - 1;
 
        // Count of odd numbers
        int k = 0;
 
        while (l < r)
        {
         
            // Find first even number from left side.
            while (arr[l] % 2 != 0)
            {
                l++;
                k++;
            }
 
            // Find first odd number from right side.
            while (arr[r] % 2 == 0 && l < r)
                r--;
 
            // Swap even number present on left and odd
            // number right.
            if (l < r)
            {
             
                // swap arr[l] arr[r]
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
 
        // Sort odd number in descending order
        Arrays.sort(arr, 0, k, Collections.
                                  reverseOrder());
 
        // Sort even number in ascending order
        Arrays.sort(arr, k, n);
    }
*/