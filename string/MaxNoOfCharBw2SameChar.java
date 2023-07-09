package string;
import java.util.*;
public class MaxNoOfCharBw2SameChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.nextLine().toCharArray();
        int a[] = new int[26];
        int i,n = s.length,first=0,res=0;
        for(i=0;i<26;i++)
        {
            a[i]=-1;
        }
        for(i=0;i<n;i++)
        {
            first = a[s[i]-97];
            if(first==-1)
            {
                a[s[i]-97]=i;
            }
            else
            {
                res=Math.max(res, Math.abs(i-first-1));
            }
        }
        System.out.println(res);
    }
}
