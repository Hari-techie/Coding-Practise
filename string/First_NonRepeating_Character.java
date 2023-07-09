package string;
import java.util.*;
public class First_NonRepeating_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int i, n = a.length;
        int c[] = new int[256];
        for(i=0;i<n;i++)
        {
            c[a[i]]++;
        }
        for(i=0;i<n;i++)
        {
            if(c[a[i]]==1)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
