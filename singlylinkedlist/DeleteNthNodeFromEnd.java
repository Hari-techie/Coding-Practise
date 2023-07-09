package singlylinkedlist;
import java.util.*;
public class DeleteNthNodeFromEnd {
    Node head,temp;
    Scanner sc = new Scanner(System.in);
    static class Node
    {
        int data;
        Node next;
    }
    void create()
    {
        int n = sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            Node nn = new Node();
            nn.data = sc.nextInt();
            if(head==null)
            {
                head=temp=nn;
            }
            else
            {
                temp.next = nn;
                temp = nn;
            }
        }
    }
    void display(Node head)
    {
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    Node delete(Node head,int d)
    {
        int l=0;
        temp=head;
        while(temp!=null)
        {
            l++;
            temp=temp.next;
        }
        if(l==d)
        {
            return head.next;
        }
        else if(l<d)
        {
            return head;
        }
        else
        {
            temp = head;
            Node p=null;
            int i;
            for(i=0;i<l-d;i++)
            {
                p=temp;
                temp=temp.next;
            }
            p.next=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteNthNodeFromEnd lst = new DeleteNthNodeFromEnd();
        lst.create();
        lst.display(lst.head);
        System.out.println("\nEnter the node to delete: ");
        int del = sc.nextInt();
        Node res = lst.delete(lst.head,del);
        lst.display(res);
        System.out.println("");
    }
}
