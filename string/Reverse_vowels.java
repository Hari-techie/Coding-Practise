package string;
import java.util.*;
public class Reverse_vowels {
    public static boolean isvowel(char c)
    {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int i=0,j=a.length-1;
        while(i<j)
        {
            if(!isvowel(a[i]))
            {
                i++;
                continue;
            }
            if(!isvowel(a[j]))
            {
                j--;
                continue;
            }
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        System.out.println(String.valueOf(a));
    }
}
