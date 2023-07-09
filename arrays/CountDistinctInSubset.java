package arrays;
import java.util.*;
public class CountDistinctInSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap <Integer,Integer> hm = new HashMap <> ();
        for(i=0;i<k;i++)
        {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(hm.size());
        for(i=k;i<n;i++)
        {
            if(hm.get(a[i-k])==1)
            {
                hm.remove(a[i-k]);
            }
            else
            {
               hm.put(a[i-k], hm.get(a[i-k])-1);
            }
            hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
            System.out.println(hm.size());
        }
    }
}
