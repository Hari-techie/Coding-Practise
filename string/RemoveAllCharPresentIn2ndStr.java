package string;
/*
Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
*/
import java.util.*;
public class RemoveAllCharPresentIn2ndStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d = sc.nextLine();
        char a[] = d.toCharArray();
        char b[] = s.toCharArray();
        int count[] = new int[256];
        int i,j;
        for(i=0;i<d.length();i++)
        {
            count[a[i]]++;
        }
        int res=0;
        for(i=0;i<b.length;i++)
        {
            if(count[b[i]]==0)
            {
                b[res]=b[i];
                res++;
            }
        }
        s = new String(b);
        System.out.println(s.substring(0, res));
    }
}
