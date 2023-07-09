package recursion;
import java.util.*;
public class SumUpto1Digit {
    static int sumdigits(int n)
        {
            if(n<=9)
            {
                return n;
            }
            int s = 0;
            while(n!=0)
            {
                s = s + n%10;
                n/=10;
            }
            return sumdigits(s);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumdigits(n));
    }
}
