package arrays.pattern;
import java.util.*;
public class p8 {
     public static void main(String[] args) {
      int n = 5;
      System.out.println(1);
      String s = "1";
      int i = 1;
      while(i<n)
      {
        String new_s = "";
        int count = 1;
        char a = s.charAt(0);
        for(int j = 1;j<s.length();j++)
        {
          if(s.charAt(j) != s.charAt(j-1))
          {
            new_s += "" + count + "" + a;
            a = s.charAt(j);
            count  = 1;
          }
          else
          {
            count++;
          }
        }
        new_s += "" + count + "" + a;
        System.out.println(new_s);
        s = new_s;
        i++;
      }  
    }
}
