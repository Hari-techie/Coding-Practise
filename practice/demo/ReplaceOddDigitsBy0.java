package demo;
import java.util.*;
public class ReplaceOddDigitsBy0 {
    public static void main(String[] args) {
        int a=123456;
        
        int temp=a;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        
       // System.out.println(count);
       
       int c=1;
       while(c<=count)
       {
           int t=1;
       for(int i=c;i<count;i++)
       {
             t*=10;
       }
       int f=a/t;
           //System.out.println(f);
       if(f==1 || f%2!=0)
       {
           System.out.print(0);
       }
       else{
           System.out.print(f);
       }
       c++;
       a=a%t;
       }
    }
            
}
