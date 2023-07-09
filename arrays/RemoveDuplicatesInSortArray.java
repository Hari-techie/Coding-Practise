package arrays;
import java.util.*;
public class RemoveDuplicatesInSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j=0,n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j++]=a[i];
            }
        }
        a[j++]=a[n-1];
        for(i=0;i<j;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
