/*
   1. find length of 2 lists
   2. find difference of lengths
   3. set long length list to diff node
   4. traverse from first 
   5. if intersect print
*/package singlylinkedlist;
import java.util.*;
public class Check_If_Intersect {
    Node head,tail;
    class Node
    {
        int data;
        Node next;
    }
    public Node create(Node head,int d)
    {
        Node nn = new Node();
        tail=nn;
        nn.data = d;
        if(head==null)
        {
            head = nn;
        }
        else
        {
            Node itr;
            for(itr=head;itr.next!=null;itr=itr.next);
            itr.next = nn;
        }
        return head;
    }
    public static void display(Node h)
    {
        Node t=h;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println("");
    }
    public static void check(Node h1,Node h2)
    {
        Node a = h1;
        Node b = h2;
        while(a!=b)
        {
            if(a==null)
            {
                a = h2;
            }
            a = a.next;
            if(b==null)
            {
                b = h2;
            }
            b = b.next;
        }
        if(a==null && b==null)
        {
            System.out.println("No intersect");
        }
        else
        {
            System.err.println("Intersected at "+a.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check_If_Intersect lst1 = new Check_If_Intersect();
        lst1.head = null;
        lst1.tail=null;
        int a[] = {1,2};
        int i;
        for(i=0;i<a.length;i++)
        {
            lst1.head = lst1.create(lst1.head, a[i]);
        }
        Check_If_Intersect lst2 = new Check_If_Intersect();
        lst2.head = null;
        lst2.tail=null;
        int c[] = {3,4};
        for(i=0;i<c.length;i++)
        {
            lst2.head = lst2.create(lst2.head, c[i]);
        }
        Check_If_Intersect lst3 = new Check_If_Intersect();
        lst3.head = null;
        lst3.tail=null;
        int b[] = {5,6,7,8};
        for(i=0;i<b.length;i++)
        {
            lst3.head = lst3.create(lst3.head, b[i]);
        }
        lst1.tail.next = lst3.head;
        lst2.tail.next = lst3.head;
        check(lst1.head,lst2.head);
    }
}
