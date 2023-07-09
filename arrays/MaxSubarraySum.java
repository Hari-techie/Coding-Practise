package arrays;
import java.util.*;
public class MaxSubarraySum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,s=0,mx,n =  sc.nextInt();
        int a[] = new int[n];
        int st=0,e=0;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        mx = a[0];
        for(i=0;i<n;i++)
        {
            s+=a[i];
            if(s<0)
            {
                s=0;
                st=i+1;
            }
            if(s>=mx)
            {
                mx=s;
                e=i;
            }
        }
        System.out.println(mx);
        for(i=st;i<=e;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
