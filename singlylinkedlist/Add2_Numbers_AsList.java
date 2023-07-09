package singlylinkedlist;
import java.util.*;
public class Add2_Numbers_AsList {
    Scanner sc =new Scanner(System.in);
    Node temp,newnode,head;
    static class Node
    {
        int data;
        Node next;
    }
    public Node create()
    {
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Node nn = new Node();
            nn.data = sc.nextInt();  
            if(head==null)
            {
                head = nn;
                temp = head;
            }
            else
            {
                temp.next = nn;
                temp = nn;
            }
        }
        return head;
    }
    public static  void display(Node h)
    {
        Node t = h;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static Node Add(Node h1,Node h2)
    {
        Node d = new Node();
        Node temp = d;
        int c=0,s;
        while(h1!=null || h2!=null || c==1)
        {
            s=0;
            if(h1!=null)
            {
                s+=h1.data;
                h1=h1.next;
            }
            if(h2!=null)
            {
                s+=h2.data;
                h2=h2.next;
            }
            s+=c;
            c=s/10;
            Node nn = new Node();
            nn.data = s%10;
            temp.next = nn;
            temp = nn;
        }
        return d.next;
    }
    Node reverse(Node head)
    {
        Node nxt=temp=head;
        Node prev = null;
        while(temp!=null)
        {
            nxt = nxt.next;
            temp.next=prev;
            prev=temp;
            temp=nxt;
        }
        head=prev;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Add2_Numbers_AsList l1 = new Add2_Numbers_AsList();
        Add2_Numbers_AsList l2 = new Add2_Numbers_AsList();
        Node h1 = l1.create();
        Node h2 = l2.create();
        display(h1);
        System.out.println("");
        display(h2);
        System.out.println("");
        Node res = Add(h1,h2);
        display(res);
        System.out.println("");
    }
}
