package demo;
import java.util.*;
/*
A 
B 1
C * 2
D * * 3
E * * * 4
F * * * * 5
*/
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=6,i,j,k,alp=65;
        for(i=0;i<n;i++)
        {
            System.out.print((char)alp+" ");
            alp++;
            for(j=2;j<=i;j++)
            {
                System.out.print("* ");
            }
            if(i!=0) System.out.print(i);
            System.out.println("");
        }
    }
}
