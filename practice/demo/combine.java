package demo;
import java.util.*;
public class combine {
    static void permut(char a[],int start,int end)
    {
        if(start==end)
        {
            System.out.print(String.valueOf(a)+" ");
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                swap(a,start,i);
                permut(a,start+1,end);
                swap(a,start,i);
            }
        }
    }
    static void swap(char a[],int i,int j)
    {
        char t = a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ABC";
        char a[] = s.toCharArray();
        permut(a,0,2);
    }
}
