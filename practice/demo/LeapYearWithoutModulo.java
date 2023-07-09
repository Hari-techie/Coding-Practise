package demo;
import java.util.*;
public class LeapYearWithoutModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        int qu = yr/4;
        int rem = yr - qu*4;
        int qu1 = yr/100;
        int rem1 = yr - qu1*100;
        int qu2 = yr/400;
        int rem2 = yr - qu2*400;
        if(rem2==0)
        {
            System.out.println("Leap year");
        }
        else if(rem1==0)
        {
            System.out.println("Not a Leap year");
        }
        else if(rem==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }
}
