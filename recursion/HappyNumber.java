package recursion;
import java.util.*;
public class HappyNumber {
    static int IsHappy(int n)
    {
        if(n<=9)
        {
            return n;
        }
        int s=0;
        while(n!=0)
        {
            int dig = n%10;
            s+=(dig*dig);
            n/=10;
        }
       return IsHappy(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(IsHappy(n)==1)
        {
            System.out.println("Happy number");
        }
        else
        {
            System.out.println("Not a Happy number");
        }
    }
}
