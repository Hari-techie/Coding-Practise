package recursion;

import java.util.*;

public class fibinocci {
    static int a=0,b=1,count=0,c;
    static int fib(int n)
    {
        if(count<n)
        {
            c=a+b;
            System.out.print(c+" ");
            count++;
            a=b;
            b=c;
            fib(n);
        }
        return 0;
    }
    static int n1=0,n2=1,n3=1;
    static void Fibo(int n)
    { 
        if(n<1)
            return;
        System.out.print(n3+" ");
        n3=n1+n2;
        n1=n2;
        n2=n3;
        Fibo(n-1);
    }
 public static void main(String[] args) {
       int n=10;
       System.out.println("Fibinocci of "+n+" terms are ");
       System.out.print(a+" "+b+" ");
       fib(n-2);
     //   System.out.print("\n"); 
     //   System.out.print("0 ");
     //  Fibo(5);
    }    
}
