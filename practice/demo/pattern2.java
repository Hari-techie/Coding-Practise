package demo;
import java.util.*;
/*
         A 
       B * C 
     D * * * E 
   F * * * * * G 
 H * * * * * * * I 
*/
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9,i,j,k,alp=65;
        for(i=1;i<=n;i=i+2)
        {
            for(k=i;k<=n;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print((char)alp+" ");
                    alp++;
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
