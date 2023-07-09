package demo;
import java.util.*;
/*
i/p : n=5
    a 
   a b 
  a b c 
 a b c d 
a b c d e 
 d c b a 
  c b a 
   b a 
    a 
*/
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5,i,j,k;
        int alp = 97;
        for(i=1;i<=n;i++)
        {
            alp = 97;
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print((char)alp+" ");
                alp++;
            }
            System.out.println("");
        }
        for(i=n-1;i>=1;i--)
        {
            alp = 97;
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print((char)(alp+j-1)+" ");
            }
            System.out.println("");
        }
    }
}
/*
public class Pattern_1 {
    public static void main(String[] args) {
        int n=5;
        
        int alph=97;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(alph+(j-1))+" ");
            }
             System.out.println();
        }
      int a=alph+n-1;
        for(int i=n-1;i>=1;i--)
    {
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print(" ");
        }
        
       // System.out.println(a);
                
        for(int j=1;j<=(i);j++)
        {
            System.out.print((char)((a)-(j))+" ");
        }
        a--;
        System.out.println();
    }
    }
    
}
*/
