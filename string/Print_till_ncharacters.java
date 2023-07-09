package string;
import java.util.*;
public class Print_till_ncharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i,n = sc.nextInt();
        int l = s.length();
        for(i=0;i<n;i++)
        {
            System.out.print(s.charAt(i%l));
        }
        System.out.println("");
    }
}
