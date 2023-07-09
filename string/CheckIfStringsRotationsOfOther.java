package string;
import java.util.*;
public class CheckIfStringsRotationsOfOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(),t = sc.nextLine();
        String concated = s+t;
        if(s.length()==t.length() && concated.indexOf(t)!=-1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
