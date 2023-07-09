package string;
import java.util.*;
public class Implement_Strstr_Atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String k = sc.next();
        int i,j=0,m=s.length()-1,n=k.length()-1;
        for(i=0;i<m;i++)
        {
            if(j==n)
                break;
            if(s.charAt(i)==k.charAt(j))
                j++;
            else
                if(j>0)
                    j--;
                j=0;
        }
        if(j<n)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
