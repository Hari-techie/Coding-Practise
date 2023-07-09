package practise;

import java.util.*;
public class rev
{
    static String reverseWords(String S)
    {
        // code here 
        String val="";
        String str[] = S.split("[.]",0);
  
        int n=str.length;
    /*    for(int i=n-1;i>=0;i--)
        {
            System.out.println(str[i]);
        }
        System.out.println(String.valueOf(str));*/
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(str[i]+" "+val);
            val=val+str[i];
            if(i>0)
            {
                val=val+".";
            }
        }
      //  System.out.println(val);
        return val;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            String num = "i.like.this";
	  //  String num=sc.nextLine();
	    String value=reverseWords(num);
		System.out.println(value);
	}
}