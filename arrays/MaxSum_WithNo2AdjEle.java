package arrays;
import java.util.*;
/*
Input : arr[] = {5, 5, 10, 100, 10, 5}
Output : 110

Input : arr[] = {1, 2, 3}
Output : 4

Input : arr[] = {1, 20, 3}
Output : 20
*/
public class MaxSum_WithNo2AdjEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,p=0,q=0;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            if(i%2==0)
                p+=a[i];
            else
                q+=a[i];
        }
        int inc=a[0],exl=0,exl_new;
        for(i=1;i<n;i++)
        {
            exl_new = Math.max(inc, exl);
            inc = exl+a[i];
            exl = exl_new;
        }
        int res = Math.max(inc, exl);
        System.out.println(res+" "+Math.max(p, q));
    }
}
