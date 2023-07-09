package arrays.pattern;
import java.util.*;
/*
ip: 12345
1   5
 2 4 
  3  
 2 4 
1   5
*/
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i,j,n = s.length();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || j==n-i-1)    // i+j==n-1
                {
                    System.out.print(s.charAt(j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
