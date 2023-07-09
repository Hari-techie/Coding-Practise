package string;
import java.util.*;
public class Run_length_decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t="",n="",s = sc.nextLine(); // 4a5v2b10a
        int i,j,l = s.length();
        for(i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z'))
            {
                int num = Integer.parseInt(n);
                for(j=1;j<=num;j++)
                {
                    t+=c;
                    n="";
                }
            }
            else
            {
                n+=c;
            }
        }
        System.out.println(t);
    }
}
