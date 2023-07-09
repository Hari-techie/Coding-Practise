package stack;
import java.util.*;
/*

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced

Input: exp = “[(])” 
Output: Not Balanced 

*/
public class Balanced_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b[] = a.toCharArray();
        int i,n = b.length;
        Stack<Character> s = new Stack <>();
        for(i=0;i<n;i++)
        {
            if(b[i]=='(' || b[i]=='{' || b[i]=='[')
            {
                s.push(b[i]);
            }
            else
            {
                char c = s.pop();
                if(c=='(' && b[i]!=')')
                {
                    System.out.println("Not Balanced");
                    return;
                }
                else if(c=='{' && b[i]!='}')
                {
                    System.out.println("Not Balanced");
                    return;
                }
                else if(c=='[' && b[i]!=']')
                {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(s.isEmpty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
}
