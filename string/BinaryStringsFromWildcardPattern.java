package string;
import java.util.*;
/*

 Replace wild cards with all possible combinations of zeros and ones.

              String given: 0?1?
              Result:
                    0010
                    0011
                    0110
                    0111 

Input str = "1??0?101"
Output: 
        10000101
        10001101
        10100101
        10101101
        11000101
        11001101
        11100101
        11101101

*/
public class BinaryStringsFromWildcardPattern {
    static void print(char s[],int ind)
    {
        if(ind==s.length)
        {
            System.out.println(s);
            return;
        }
        if(s[ind]=='?')
        {
            s[ind]='0';
            print(s,ind+1);
            s[ind]='1';
            print(s,ind+1);
            s[ind]='?';
        }
        else
        {
            print(s,ind+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.nextLine().toCharArray();
        print(s,0);
    }
}
