package arrays.pattern;
import java.util.*;
/*
Input: PROGRAM
Output:
              G
            GR
          GRA
       GRAM
     GRAMP
   GRAMPR
GRAMPRO
*/
public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a[] = sc.nextLine().toCharArray();
        int n = a.length,i,j,k,m=n/2;
        for(i=0;i<n;i++)
        {
            m = n/2;
            for(k=i;k<n-1;k++)
            {
                System.out.print("  ");
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
