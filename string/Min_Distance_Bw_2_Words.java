package string;
import java.util.*;
/*
Input : s = “geeks for geeks contribute practice”, w1 = “geeks”, w2 = “practice” 
Output : 1 
There is only one word between the closest occurrences of w1 and w2.

Input : s = “the quick the brown quick brown the frog”, w1 = “quick”, w2 = “frog”
Output : 2
*/
public class Min_Distance_Bw_2_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        int i,n = s.length;
        int mn = n+1,prev=0;
        System.out.println(word1+" "+word2);
        for(i=0;i<n;i++)
        {
            if(s[i].equals(word1)|| s[i].equals(word2))
            {
                prev = i;
                break;
            }
        }
        for(i=0;i<n;i++)
        {
            if(s[i].equals(word1)|| s[i].equals(word2))
            {
                if((!s[i].equals(s[prev]))&& i-prev<=mn)
                {
                    mn = i-prev-1;
                }
                prev=i;
            }
        }
        System.out.println("Minimum distance is "+mn);
    }
}
