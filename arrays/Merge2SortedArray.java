package arrays;
import java.util.*;
public class Merge2SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,m=sc.nextInt(),n;
        int a[] =new int[m];
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt(); 
        }
        n=sc.nextInt();
        int b[] = new int[n];
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt(); // a={1,3,5}  b={2,4}
        }
        for(i=n-1;i>=0;i--)
        {
            int last = a[m-1];   // 5     4
            for(j=m-2;j>=0 && a[j]>b[i];j--)  // 1 3 3  // 1 1 3
            {
                a[j+1]=a[j];
            }
            if(j!=m-2 || last>b[i])   // 
            {
                a[j+1] = b[i];  // 1 3 4   
                b[i] = last;    // 2 5
            }
        }
        for(i=0;i<m;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("");
    }
}
