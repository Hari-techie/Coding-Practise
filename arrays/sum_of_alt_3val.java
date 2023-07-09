package arrays;
import java.util.*;

public class sum_of_alt_3val {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int i,a=0,b=0,c=0,n=sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i+=3)
        {
            a+=arr[i];
        }
        for(i=1;i<n;i+=3)
        {
            b+=arr[i];
        }
        for(i=2;i<n;i+=3)
        {
            c+=arr[i];
        }
        System.out.println(a+" "+b+" "+c);
    }
}
