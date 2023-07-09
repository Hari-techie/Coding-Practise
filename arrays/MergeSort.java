package arrays;
import java.util.*;
/*
 4 7 9 11 2 5 6 8
 2 4 5 6 7 8 9 11
*/
public class MergeSort {
    public static void mergesort(int a[],int start,int end)
    {
       if(start!=end)
       {
           int mid = (start+end)/2; // 3
           mergesort(a,start,mid);  // 0-3  0-1 0 4-5
           mergesort(a,mid+1,end);  // 4-7  2-3 1
           merge(a,start,mid,end);
       }
    }
    public static void merge(int a[],int start,int mid,int end)
    {
        int i=start; // 0
        int j=mid+1,k=0; // 2
        int temp[] = new int[end-start+1]; // 4
        while(i<=mid && j<=end) // i->4 9   j->7 11
        {
            if(a[i]<a[j]) 
                temp[k++] = a[i++];// 4 7 9
            else
                temp[k++] = a[j++];// 4 7
        }
        while(i<=mid) 
        {
            temp[k++] = a[i++];
        }
        while(j<=end)
        {
            temp[k++] = a[j++]; // 4 7
        }
        for(i=start;i<=end;i++) 
        {
            a[i]=temp[i-start];
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
        mergesort(a,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
