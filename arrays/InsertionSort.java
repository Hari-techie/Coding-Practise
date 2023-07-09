package arrays;
import java.util.*;

/*
          4 9 7 11 2 --> 
   i=0 -->2 4 9 7 11  -->min=3 temp = 7
   i=1 -->2 4 7 9 11
   i=2 -->
   i=3 -->
*/

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int min_ind = 0,k,temp;
        for(i=0;i<n;i++)
        {
            min_ind = i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    min_ind = j;
                }
            }
            temp = a[min_ind];
            if(min_ind!=i)
            {
                for(k=min_ind;k>i;k--)
                {
                    a[k] = a[k-1];
                }
                a[i] = temp;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
