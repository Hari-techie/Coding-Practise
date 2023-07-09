package arrays;
import java.util.*;
/*
Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
Output: 5
Explanation: The longest sub-array with 
elements summing up-to 0 is {-2, 2, -8, 1, 7}

Input: arr[] = {1, 2, 3}
Output: 0
Explanation:There is no subarray with 0 sum

Input:  arr[] = {1, 0, 3}
Output:  1
Explanation: The longest sub-array with 
elements summing up-to 0 is {0}
*/
public class MaxLengthOfSubArrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashMap <Integer,Integer> h = new HashMap<>();
        int s=0,mx=0;
        for(i=0;i<n;i++)
        {
            s+=a[i];
            if(s==0)
            {
                mx = i+1;
            }
            else
            {
                if(h.get(s)!=null)
                {
                    mx = Math.max(mx, i - h.get(s));
                }
                else
                {
                    h.put(s, i);
                }
            }
        }
        System.out.println(mx);
    }
}
