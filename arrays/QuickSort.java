package arrays;
import java.util.*;
/*
   6  2 3 4 10 
             ij
   pivot = 6
   
*/
public class QuickSort {
    public static void quick(int a[],int start,int end)
    {
        if(start < end)
        {
            int i,j,temp,pivot;
            pivot = start;
            i = start;
            j = end;
            
            while(i<j)
            {
                while(i<end && a[i]<=a[pivot])
                    i++;
                while(j>=0 && a[j]>a[pivot])
                    j--;
                if(i<j)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            temp=a[pivot];
            a[pivot]=a[j];
            a[j]=temp;
            quick(a,start,j-1);
            quick(a,j+1,end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        quick(a,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}

