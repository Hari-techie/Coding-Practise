// No of primes in a specified range
// the value in that range 
package arrays;

import java.util.*;

public class Arrays {
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter n value : ");
        int c=0,i,j,k=0,n = sc.nextInt();
        int arr[] = new int[100];
        for(i=1;i<=n;i++)
        {
            int flag=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==2)
            {
                arr[k++]=i;
                c++;
            }
        }
        System.out.println("No of primes in a range of "+n+" is "+c);
        for(i=0;i<arr.length && i<c;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void sort(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Object stream(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
