package arrays;
import java.util.*;
/*
          4 9 7 11 2 --> 2 4 9 7 11 
   i=0 -->2 9 7 11 4
   i=1 -->2 4 7 11 9
   i=2 -->2 4 7 11 9
   i=3 -->2 4 7 9 11
*/
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,j,min,temp;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
