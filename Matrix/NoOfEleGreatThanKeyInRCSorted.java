package Matrix;
import java.util.*;
public class NoOfEleGreatThanKeyInRCSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,j;
        int a[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int c=0;
        i = 0;
        j=n-1;
        while(i<n && j>=0)
        {
            if(k <= a[i][j])
            {
                c=c+n-i;
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println(c);
    }
}
/*
1 2 3
4 5 6
7 8 9
*/