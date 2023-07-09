package singlylinkedlist;
import java.util.*;
public class Reverse_K_size {
    Node head,temp;
    static class Node
    {
        int data;
        Node next;
    }
    public static Node create()
    {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        Node head=null,temp=null;
        for(i=0;i<n;i++)
        {
            Node nn = new Node();
            nn.data = sc.nextInt();
            if(head==null)
            {
                head = temp = nn;
            }
            else
            {
                temp.next = nn;
                temp = nn;
            }
        }
        return head;
    }
    public static void display(Node h)
    {
        Node t=h;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println("");
    }
    public static Node reverse(Node h, int k)
    {
        if(h==null || k==1)
            return h;
        Node d = new Node();
        d.next = h;
        Node cur = d,pre = d,nex = d;
        int c=0,i;
        Node t= h;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        while(c>=k)
        {
            cur = pre.next;
            nex = cur.next;
            for(i=1;i<k;i++)
            {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            c-=k;
        }
        return d.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node h =create();
        display(h);
        System.out.println("Enter size to reverse it :");
        int k = sc.nextInt();
        Node r =reverse(h,k);
        display(r);
    }
}
