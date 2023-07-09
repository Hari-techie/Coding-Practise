package singlylinkedlist;
import java.util.*;
public class RotateAntiClockwise {
    Node head,temp,nn;
    class Node
    {
        int data;
        Node next;
    }
    void create()
    {
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        for(i=0;i<n;i++)
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
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
    int getsize()
    {
        int count = 0;
        temp = head;
         while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    void rotate(Node curhead,int k)
    {
        if(curhead==null)
        {
            return;
        }
        int size = getsize();
        k = k%size;
        if(k==0)
        {
            return;
        }
        int i=1;
        temp = curhead;
        while(i<k)
        {
            temp = temp.next;
            i++;
        }
        Node t = temp.next;
        temp.next = null;
        head = t;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next = curhead;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RotateAntiClockwise lst = new RotateAntiClockwise();
        lst.create();
        lst.display();
        int k = sc.nextInt();
        lst.rotate(lst.head,k);
        lst.display();
    }
}
