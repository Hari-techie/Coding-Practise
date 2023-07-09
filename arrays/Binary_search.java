package arrays;
import java.util.*;
public class Binary_search {
    static int binary_search(int a[],int n,int k)
    {
        int l=0,h=n-1;
        int mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(a[mid]==k)
            {
                return mid;
            }
            else if(a[mid]<k)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int ind = binary_search(a,n,k);
        System.out.println("Index is "+ind);
    }
}
