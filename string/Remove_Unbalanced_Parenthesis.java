package string;
import java.util.*;
/*
Input  : str = “()())()” -
Output : ()()() (())()
There are two possible solutions
"()()()" and "(())()"

Input  : str = (v)())()
Output : (v)()()  (v())()
*/
public class Remove_Unbalanced_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b[] = a.toCharArray();
        int i,n = b.length,op=0,st=0,cl=0,end=n-1;
        for(;st<n;st++,end--)
        {
            if(b[st]=='(')
                op++;
            else if(b[st]==')')
                op--;
            if(b[end]==')')
                cl++;
            else if(b[end]=='(')
                cl--;
            if(op< 0)
            {
                b[st]='1';
                op=0;
            }
            else if(cl<0)
            {
                b[end]='1';
                cl=0;
            }   
        }
        String t="";
        for(i=0;i<n;i++)
        {
            if(b[i]!='1')
                t+=b[i];
        }
        System.out.println(t);
    }
}
