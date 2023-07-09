package string;
import java.util.*;
public class Reverse_Persieving_Spl_pos {
    static boolean isAlpha(char a)
    {
        if((a>='a' && a<='z')||(a>='A' && a<='Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int n = s.length()-1,i=0,t=n;
        while(i<t)
        {
            if(!isAlpha(a[i]))
            {
                i++;
                continue;
            }
            else if(!isAlpha(a[t]))
            {
                t--;
                continue;
            }
            else
            {
                char temp = a[i];
                a[i] = a[t];
                a[t] = temp;
                i++;
                t--;
            }
        }
        String b = String.valueOf(a);
        System.out.println(b);
    }
}
