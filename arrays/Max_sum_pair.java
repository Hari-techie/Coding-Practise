package arrays;
import java.util.*;
public class Max_sum_pair {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[] = new int[n];
    int i,mx1=0,mx2=0;
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    if(a[0]>a[1])
    {
        mx1 = a[0];
    }
    else
    {
        mx2 = a[1];
    }
    for(i=2;i<n;i++)
    {
        if(a[i]>mx1)
        {
            mx2 = mx1;
            mx1 = a[i];
        }
        if(a[i]>mx2 && a[i]!=mx1)
        {
            mx2 = a[i];
        }
    }
        System.out.println("The maximum sum pair is "+mx1+" + "+mx2+" = "+(mx1+mx2));
   }
}
