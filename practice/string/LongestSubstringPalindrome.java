
package string;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestSubstringPalindrome  {
public static void longpalin(String s)
{
    int i,j,ind=0,mx=0,k=0,len;
    String t;
    List<String>list = new ArrayList<String>(); 
    for(i=0;i<s.length();i++)
    {
        for(j=s.length();j>=i;j--)
        {
            t = s.substring(i,j);
          //  System.out.println(t);
            if(ispalin(t) && t.length()>=1)
            {
                list.add(t);
            }
        }
    }
    for (String st: list)
    {
        len = st.length();
        if(len>mx)
        {
            mx=len;
            ind=k;
        }
        k++;
    }
    System.out.println(list.get(ind));
    Collections.emptyList();
}
public static boolean ispalin(String t)
{
    String s = new StringBuilder(t).reverse().toString();
    if (s.equals(t))
    {
        return true;
    }
    else
    {
        return false;
    }
}

	public static void main (String[] args)
        {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T!=0)
		{
		    String s = sc.next();
		    longpalin(s);
		    T-=1;
		}
	}
}`