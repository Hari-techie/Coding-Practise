package arrays;
import java.util.*;
public class zoho3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),s=0,i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        for(i=0;i<n;i++)
        {
            System.out.print((s-a[i])+" ");
        }
        System.out.println("");
    }
}
