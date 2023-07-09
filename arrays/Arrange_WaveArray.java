package arrays;
import java.util.*;
public class Arrange_WaveArray {
    public static void swap(int a[],int i,int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i=i+2)
        {
            if(i>0 && a[i]<a[i-1])
            {
                swap(a,i,i-1);
            }
            else if(i<n-1 && a[i]<a[i+1])
            {
                swap(a,i,i+1);
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
