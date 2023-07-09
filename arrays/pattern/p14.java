package arrays.pattern;
import java.util.*;
/*
   i/p: 4
   o/p :
     1
     3 6
     5 10 15
     7 14 21 28
*/
public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n=5,p=1;
        for(i=1;i<(2*n);i=i+2)
        {
        for(j=i;j<=i*p;j=j+i)
        {
            System.out.print(j+" ");
        }
        p++;
        System.out.println("");
        }
    }
}
