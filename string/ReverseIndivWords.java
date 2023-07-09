package string;
/*
i/p: have a good day
o/p: eavh a doog yad
*/
import java.util.*;
public class ReverseIndivWords
{
    static void swap(char a[],int s,int e)
    {
        char t;
        int i,j=e;
        for(i=s;i<(s+e)/2;i++)
	{
	    t=a[i];
            a[i]=a[j];
            a[j]=t;
            j--;
        }    
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
	            swap(a,st,i-1);
	            st=i+1;
	        }
	    }
	    swap(a,st,len-1);
	    System.out.println(String.valueOf(a));
	}
}
