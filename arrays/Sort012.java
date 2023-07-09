package arrays;
import java.util.*;
public class Sort012 
{
    static void swap(int a[],int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 0, 1, 2};
        int n=a.length,i=0,mid=0,j=n-1;
        while(mid<=j)
        {
            if(a[mid]==0)
            {
                swap(a,i,mid);
                i++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(a,j,mid);
                j--;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
