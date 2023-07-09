package stack;
import java.util.*;
public class Postfix_Evaluation
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char a[] = sc.nextLine().toCharArray();
        Stack<Integer> s = new Stack<>();
        int i,n=a.length;
        for(i=0;i<n;i=i+2)
        {
            char t = a[i];
            if(t>='0' && t<='9')
            {
                s.push(t-'0');
            }
            else
            {
                int u = s.pop();
                int v = s.pop();
                switch(t)
                {
                    case '+':
                        s.push(v+u);
                        break;
                    case '-':
                        s.push(v-u);
                        break;
                    case '*':
                        s.push(u*v);
                        break;
                    case '/':
                        s.push(v/u);
                        break;
                }
            }
        }
        System.out.println(s.pop());
    }
}