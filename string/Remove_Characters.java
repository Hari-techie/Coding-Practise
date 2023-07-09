package string;
import java.util.*;
public class Remove_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int c[] = new int[256];
        char a[] = s.toCharArray();
        for(int i=0;i<t.length();i++)
        {
            c[t.charAt(i)]++;
        }
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            if(c[a[i]]==0)
            {
                a[res]=a[i];
                res++;
            }
        }
        for(int i=0;i<res;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("");
    }
}
