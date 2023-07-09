package practise;

import java.util.*;
import java.util.Arrays;

public class rotation {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        int temp,r = sc.nextInt();
        int arr [] = new int [n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before rotation");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+"Array after left rotation");
        for(i=0;i<r;i++)
        {
            temp = arr[0];
            for(int j=0;j<n-1;j++)
            {
               arr[j]= arr[j+1];
            }
            arr[n-1]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
