package Loops;
import java.util.Scanner;
public class Count_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),c=0;
        while(n!=0)
        {
            c++;
            n&=(n-1);
        }
        System.out.println("Count of set bit is "+c);
    }
}
