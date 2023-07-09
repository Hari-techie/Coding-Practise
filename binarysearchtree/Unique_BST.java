package binarysearchtree;
import java.util.*;
/*
Dynamic programming 
catalan number
n=3
c(3) = c0c2 + c1c1 + c2c0
*/
public class Unique_BST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int a[] = new int[n+1];
        a[0]=a[1]=1;
        for(i=2;i<=n;i++)
        {
            a[i]=0;
            for(j=0;j<i;j++)
            {
                a[i]+=a[j]*a[i-j-1];
            }
        }
        System.out.println(a[n]);
    }
}
