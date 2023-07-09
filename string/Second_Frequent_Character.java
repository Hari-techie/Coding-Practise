package string;
import java.util.*;
public class Second_Frequent_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int i, n = s.length();
        int c[] = new int[256];
        for(i=0;i<n;i++)
        {
            c[a[i]]++;
        }
        int first=0,sec=0;
        for(i=0;i<256;i++)
        {
            if(c[i]>first)
            {
                sec =first;
                first=i;
            }
            else if(c[i]>sec && c[i]!=first)
            {
                sec = i;
            }
        }
        System.out.println((char)sec);
    }
}
