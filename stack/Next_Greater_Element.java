package stack;
import java.util.*;
/*
input : 6,8,0,1,3
Output
[8, -1, 1, 3, -1]

Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
*/
public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Stack <Integer> s = new Stack <>();
        int nge[] = new int[n];
        for(i=2*n-1;i>=0;i--)
        {
            while((!s.isEmpty()) && s.peek()<= a[i%n])
            {
                s.pop();
            }
            if(i<n)
            {
                if(!s.isEmpty())
                {
                    nge[i]=s.peek();
                }
                else
                {
                    nge[i]=-1;
                }
            }
            s.push(a[i%n]);
        }
        for(i=0;i<n;i++)
        {
            System.out.print(nge[i]+" ");
        }
        System.out.println("");
    }
}
