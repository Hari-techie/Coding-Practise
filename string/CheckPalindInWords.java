package string;
/*
i/p: have a good day
o/p: eavh a doog yad
*/
import java.util.*;
public class CheckPalindInWords
{
    static boolean ispalin(String t)
    {
        char c[] = t.toCharArray();
        int i,n=c.length,j=n-1;
        for(i=0;i<j/2;i++)
	{
	    if(c[i]!=c[j])
            {
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    char a[] = s.toCharArray();
	    int len=0;
	    for(char c:a)
	    {
	        len++;
	    }
	    int i,j=len-1,st=0;
	    char t;
	    for(i=0;i<len;i++)
	    {
	        if(a[i]==' ')
	        {
                    String k = s.substring(st, i);
	            if(ispalin(k))
                    {
                        System.out.println(k);
                    }
	            st=i+1;
	        }
	    }
            String p = s.substring(st,len);
            if(ispalin(p))
            {
                System.out.println(p);
            }
	}
}
