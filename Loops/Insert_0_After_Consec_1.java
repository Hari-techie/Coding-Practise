package Loops;
import java.util.*;
public class Insert_0_After_Consec_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of bits : ");
        int n = sc.nextInt(),i,j;
        int a[] = new int[30];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt(),c=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                c++;
            }
            else
            {
                c=0;
            }
            if(c==k)
            {
                n++;
                for(j=n-1;j>i;j--)
                {
                    a[j]=a[j-1];
                }
                a[i+1]=0;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
