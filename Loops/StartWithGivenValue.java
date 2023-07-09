package Loops;
import java.util.*;
/*
input : 
n=6 c=5
output:3 4 5 6 1 2
*/
public class StartWithGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt();
        int i;
        int s = n-c+2;
        s = n==1?1:s;
        for(i=1;i<=n;i++)
        {
            if(s>n)
                s=1;
            System.out.print(s+" ");
            s++;
        }
        System.out.println("");
    }
}
