package recursion;

import java.util.*;

public class Recursion {
    static int fun(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fun(n-1);
        }
      return 0;  
    }
    public static void main(String[] args) {
       int n=3;
       fun(n);
    }
    
}
