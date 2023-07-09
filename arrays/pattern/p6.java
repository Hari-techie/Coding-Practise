package arrays.pattern;

public class p6 
{
    public static void main(String[] args)
    {
        int i,k=1,n=5,a[]=new int[n+8];
    a[0]=3;
    a[1]=4;
    for(i=0;i<n;i++)
    {
        a[++k]=(a[i]*10)+3;
        a[++k]=(a[i]*10)+4;
    }
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
    }
    
}
