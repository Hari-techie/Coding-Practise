package arrays;
import java.util.*;
/*

Given an array of integers, replace every element with the next greatest element
(greatest element on the right side) in the array.
{16, 17, 4, 3, 5, 2} = {17, 5, 5, 5, 2, -1}

*/
public class ReplaceWithRightMostHighElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int mx = a[n-1],temp;
        a[n-1]=-1;
        for(i=n-2;i>=0;i--)
        {
            temp = a[i];
            a[i] = mx;
            if(temp>mx)
            {
                mx=temp;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
