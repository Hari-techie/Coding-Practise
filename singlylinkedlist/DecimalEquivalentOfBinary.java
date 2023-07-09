package singlylinkedlist;
import java.util.*;
/*

Input:
2
3
0 1 1    
4
1 1 1 0

Output:
3
14

Explanation:
Testcase 1: 1*20 + 1*21 + 0*22 =  1 + 2 + 0 = 3.

*/
public class DecimalEquivalentOfBinary {
    static class Node
    {
        int data;
        Node next;
    }
    public static Node create(Node head,int d)
    {
        Node nn = new Node();
        nn.data = d;
        if(head==null)
        {
            head = nn;
            return head;
        }
        else
        {
            Node itr;
            for(itr=head;itr.next!=null;itr=itr.next);
            itr.next = nn;
            return head;
        }
    }
    public static int decimal(Node head)
    {
        Node t = head;
        int res = 0;
        while(t!=null)
        {
            res = (res << 1) + t.data;
            t = t.next;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,n=a.length;
        Node head=null;
        for(i=0;i<n;i++)
        {
            int d = Integer.parseInt(a[i]);
            head = create(head,d);
        }
        int val = decimal(head);
        System.out.println(val);
    }
}
