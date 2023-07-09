package singlylinkedlist;
import java.util.*;
public class RotateClockwise {
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
    void display()
    {
        Node temp = head;
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
    void rotate(Node t,int k)
    {
        if(t==null)
        {
            return;
        }
        int size = getsize();
        k = k%size;
        if(k==0)
        {
            return;
        }
        Node temp = t;
        int i=1;
        while(i < size-k)
        {
            temp = temp.next;
            i++;
        }
        Node nxt = temp.next;
        head = nxt;
        temp.next = null;
        while(nxt.next!=null)
        {
            nxt = nxt.next;
        }
        nxt.next = t;
       // return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RotateClockwise lst = new RotateClockwise();
        lst.create();
        lst.display();
        int k = sc.nextInt();
        lst.rotate(lst.head, k);
        lst.display();
    }
}
