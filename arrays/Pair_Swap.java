package arrays;
import java.util.*;
public class Pair_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i=i+2)
        {
            a[i] = (a[i]+a[i+1]) - (a[i+1]=a[i]);  // a=10  b=20  
        }                                          // a = (a+b)-(b=a)
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
