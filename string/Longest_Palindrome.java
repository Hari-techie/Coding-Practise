package string;
import java.util.*;
public class Longest_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        boolean dp[][] = new boolean[n][n];
        int i,j,k,mxlen=1,start;
        for(i=0;i<n;i++)
        {
            dp[i][i]=true;
        }
        for(i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                mxlen=2;
            }              // thisismonk
        }
        for(k=3;k<=n;k++)
        {
            for(i=0;i<n-k+1;i++)  // 8
            {
                j=k+i-1;
                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j))
                {
                    dp[i][j]=true;
                    if(k>mxlen)
                    {
                        start=i;
                        mxlen=k;
                    }
                }
            }
        }
        System.out.println("Maximum palindrome in substring is "+mxlen);
    }
}
