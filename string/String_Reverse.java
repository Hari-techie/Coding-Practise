import java.util.*;
public class String_Reverse
{
	public static void main(String[] args) {
	   String a = "Have a good day";
	   char s[] = a.toCharArray();
	   int i,l = s.length;
	   for(i=0;i<l/2;i++)
	   {
	       char c = s[l-1-i];
	       s[l-i-1] = s[i];
	       s[i] = c;
	   }
	   int st=0,e=0,j;
	   for(i=0;i<l;i++)
	   {
	       if(s[i]==' ' || i==l-1)
	       {
                   if(i==l-1){i++;}
	           for(j=st;j<(st+i)/2;j++)
	           {
	               char t = s[j];
	               s[j] = s[st+i-j-1];
	               s[st+i-j-1] = t;
	           }
	         
	           st=i+1;
	       }
	   }
	   System.out.println(String.valueOf(s));
	}
}
