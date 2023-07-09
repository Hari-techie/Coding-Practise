package singlylinkedlist;

import java.util.*;

public class middle_element {
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
    void mid_element(Node head)
    {
        Node mid = head;
        int c=0;
        while(head!=null)
        {
            if(c%2==1)
            {
                mid=mid.next;
            }
            c++;
            head=head.next;
        }
        System.out.println(mid.data);
    }
    void mid_using_sp_fp(Node head)
    {
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        middle_element lst = new middle_element();
        lst.create();
        lst.mid_element(lst.head);
        lst.mid_using_sp_fp(lst.head);
    }
}
