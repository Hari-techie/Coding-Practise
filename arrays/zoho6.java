package arrays;
import java.util.*;
public class zoho6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int i=0,n = a.length-1,t=n;
        while(i<t)
        {
            if(a[i]==' ' )
            {
                i++;
                continue;
            }
            else if(a[t]==' ')
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
