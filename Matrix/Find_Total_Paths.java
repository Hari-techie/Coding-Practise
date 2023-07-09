/*
    count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down
Examples : 
 

Input :  m = 2, n = 2;
Output : 2
There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

Input :  m = 2, n = 3;
Output : 3
There are three paths
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)
*/
package Matrix;
import java.util.*;
public class Find_Total_Paths {
    public static int count(int m,int n)
    {
        if(m==1 || n==1)
            return 1;
        return count(m-1,n) + count(m,n-1);    // (m+n-2)!/(m-1)!(n-1)!
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int co = count(r,c);
        System.out.println(co);
        int dp[] = new int[c];
        dp[0]=1;
        for(int i=0;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                dp[j]+=dp[j-1];
            }
        }
        System.out.println(dp[c-1]);
    }
}
