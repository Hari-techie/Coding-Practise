package singlylinkedlist;

import java.util.*;

public class nth_node_from_end {
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
    void nth_node_from_last()
    {
        int i,l = 0;
        int k = sc.nextInt();
        temp = head;
        while(temp!=null)
        {
            l++;
            temp = temp.next;
        }
        temp = head;
        for(i=1;i<l-k+1;i++)
        {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        nth_node_from_end lst = new nth_node_from_end();
        lst.create();
        lst.nth_node_from_last();
    }
}
