package arrays;
import java.util.*;
public class zoho5 {
    static int i=1;
    static void print_all_permutation(String s,int start,int end)// abc 0 2 // abc 1 2
    {
        System.out.print(s+" # ");
        if(start==end)
        {
            System.out.print(s+" "+i+"--");
            i++;
        }
        else
        {
            for(int i=start;i<=end;i++) // 0 2 // 1 2 // 2 2 
            {
                s = swap(s,start,i); // abc  // abc // abc
                print_all_permutation(s,start+1,end); // 
                s = swap(s,start,i);
            }
        }
    }
    static String swap(String s,int a,int b)
    {
        char c[] = s.toCharArray();
        char t = c[a];
        c[a] = c[b];
        c[b] = t;
        String r = String.valueOf(c);
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length()-1;
        print_all_permutation(s,0,len);
        
    }
}
