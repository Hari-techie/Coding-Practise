package singlylinkedlist;

import java.util.*;

public class delete_by_key {
    Scanner sc = new Scanner(System.in);
    Node head,newnode,temp,p;
    class Node
    {
        int data;
        Node next;
    }
    void create()
    {
        int n = sc.nextInt(),i;
        for(i=0;i<n;i++)
        {
            newnode = new Node();
            newnode.data = sc.nextInt();
            if(head==null)
            {
                head=temp=newnode;
            }
            else
            {
                temp.next = newnode;
                temp = newnode;
            }
        }
        display();
    }
    void display()
    {
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void del_by_key()
    {
        int k = sc.nextInt();
        temp=head;
        if(head.data==k)
        {
            head = temp.next;
            return;
        }
        while(temp!=null && temp.data!=k )
        {
            p = temp;
            temp = temp.next;
        }
        p.next = temp.next;
        display();
    }
    public static void main(String[] args) {
        delete_by_key lst = new delete_by_key();
        lst.create();
        lst.del_by_key();
    }
}
