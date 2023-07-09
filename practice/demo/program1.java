package demo;
import java.util.*;
/*
.Input: {2, 10,10, 100, 2, 10, 11,2,11,2}
Output - 2 10 11

Input: {5, 40, 1, 40, 100000, 1, 5, 1}
Output - 1 5 40 

*/
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(h.get(a[i])==null)
            {
                h.put(a[i], 1);
            }
            else
            {
                h.put(a[i], h.get(a[i])+1);
            }
        }
        for(Integer k:h.keySet())
        {
            if(h.get(k)>1)
            {
                System.out.print(k+" ");
            }
        }
    }
}
