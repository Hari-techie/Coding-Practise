package demo;
import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        int i,n=s.length(),count=0;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||  s.charAt(i)=='U')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
