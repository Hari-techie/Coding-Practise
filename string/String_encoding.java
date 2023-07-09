package string;
import java.util.*;
public class String_encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(),encode="";
        char a[] = s.toCharArray();
        int i,count=0,n = s.length();
        for(i=0;i<n;i++)
        {
            count = 1;
            while(i<n-1 && a[i]==a[i+1])
            {
                count++;
                i++;
            }
           encode= encode + a[i] + String.valueOf(count);
        }
        System.out.println(encode);
    }
}
