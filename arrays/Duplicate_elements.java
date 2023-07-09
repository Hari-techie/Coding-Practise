package arrays;
import java.util.*;
public class Duplicate_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(h.get(a[i])==null)
            {
                h.put(a[i],1);
            }
            else 
            {
                h.put(a[i],h.get(a[i])+1);
            }
        }
        System.out.println(h);
    }
}
