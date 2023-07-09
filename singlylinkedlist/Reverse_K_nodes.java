package singlylinkedlist;
import java.util.*;
public class Reverse_K_nodes {
    Node head,temp,nn;
    class Node
    {
        int data;
        Node next;
    }
    void create()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        for(i=1;i<=n;i++)
        {
            nn = new Node();
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
    }
    void display(Node h)
    {
        Node temp = h;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    int getsize()
    {
        Node temp = head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    Node reverse(Node head,int k)
    {
        temp = head;
        Node next = null, prev = null;
        int i=0;
        while(temp!=null && i<k)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            i++;
        }
        if(next!=null)
        {
            head.next = reverse(next,k);
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse_K_nodes lst = new Reverse_K_nodes();
        lst.create();
        lst.display(lst.head);
        int k = sc.nextInt();
        Node h = lst.reverse(lst.head, k);
        lst.display(h);
    }
}
