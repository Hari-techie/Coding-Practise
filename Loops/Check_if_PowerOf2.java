package Loops;
import java.util.*;
public class Check_if_PowerOf2 {
    public static void check(int x)
    {
        if(x!=0 && (x&(x-1)) == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static boolean isPowerOf(int n, int k)
    {
        if(n==1 || k==n)
            return true;
        if(n%k!=1)
            return false;
        return isPowerOf(n/k,k);
    }
    public static void check_by_count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n &= (n-1);
        }
        if(c==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
        check_by_count(n);
        System.out.println("Enter n value and k value :");
        int num = sc.nextInt(), k = sc.nextInt();
        if(isPowerOf(n,k))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
