package arrays;
import java.util.*;
public class Missing_element {
    public  void findMissingUsingHashMap(int arr[],int n)
    {
        HashMap <Integer,Boolean> h = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(arr[i],true);
        }
        for(int i=1;i<=n;i++)
        {
            if(h.get(i)==null)
            {
                System.out.println((i));
            }
        }
    }
    public  void findMissingUsingFormula(int arr[],int n)
    {
        int i,s=0,f=0;
        for(i=0;i<n;i++)
        {
            s+=arr[i];
        }
        n = n+1;
        f = n*(n+1)/2;
        System.out.println("The missing element is: "+(f-s));
    }
    public void findMissingUsingXor(int arr[],int n)
    {
        int i,j,x1=1,x2=1;
        for(i=1;i<=n+1;i++)
        {
            x1=x1^i;
        }
        for(j=0;j<n;j++)
        {
            x2=x2^arr[j];
        }
        System.out.println(x1^x2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Missing_element m = new Missing_element();
        int i,n = sc.nextInt();
        int a[] = new int [n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m.findMissingUsingHashMap(a,n);
        m.findMissingUsingFormula(a,n);
        m.findMissingUsingXor(a,n);
    }
}
