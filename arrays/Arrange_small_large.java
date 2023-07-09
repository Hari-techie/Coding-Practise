package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Arrange_small_large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i,j,ind=0;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int b[] = new int[n];
        for(i=0,j=n-1;i<=n/2||j>n/2;i++,j--)
        {
            if(ind < n)
            {
                b[ind]=a[i];
                ind++;
            }
            if(ind < n)
            {
                b[ind]=a[j];
                ind++;
            }
        }
        for(i=0;i<n;i++)
        {
            a[i]=b[i];
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
