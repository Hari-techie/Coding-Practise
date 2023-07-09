package arrays.pattern;
import java.util.*;
/*
They will give any word as input for ex: WATER. This should be printed as

        T
       TE
      TER
     TERW
    TERWA
*/
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a[] = sc.nextLine().toCharArray();
        int n = a.length,i,j,k,m=n/2;
        for(i=0;i<n;i++)
        {
            m = n/2;
            for(k=n-i-1;k>0;k--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(a[m]+"");
                m = (m+1)%n;
            }
            System.out.println("");
        }
    }
}
