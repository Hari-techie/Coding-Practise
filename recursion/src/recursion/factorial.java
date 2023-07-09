package recursion;

import java.util.*;

public class factorial {
    
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return fact(n-1)*n;
        }
    }
 public static void main(String[] args) {
       int n=5;
       System.out.println("Factorial of "+n+" is "+fact(n));
    }    
}
