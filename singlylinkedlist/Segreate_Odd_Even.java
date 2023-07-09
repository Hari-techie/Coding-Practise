package singlylinkedlist;

import java.util.*;

public class Segreate_Odd_Even {
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
    }
    void display(Node head)
    {
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int count()
    {
        temp = head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
     Node divide(Node head)
    {
        int i,n = count();
        Node temp=head;
        Node nn=null,val=null,odd=null,prev=null;
        for(i=0;i<n;i++)
        {
            if((temp.data)%2==0)
            {
                if(nn==null)
                {
                    val=nn=temp;
                }
                else
                {
                    val.next = temp;
                    val=temp;
                }
            }
            else
            {
                if(odd==null)
                {
                    prev=odd=temp;
                }
                else
                {
                    prev.next=temp;
                    prev=temp;
                }
            }
            temp=temp.next;
        }
     //   System.out.println(val.data+" "+prev.data);
        val.next=odd;
        prev.next=null;
        return nn;
    }
    public static void main(String[] args) {
        Segreate_Odd_Even lst = new Segreate_Odd_Even();
        lst.create();
        lst.display(lst.head);
        Node res = lst.divide(lst.head);
        lst.display(res);
    }
}
/*
Node divide(Node head)
    {
        int i,n = count();
        Node temp=head;
        Node nn=null,val=null,odd=null,prev=null;
        for(i=0;i<n;i++)
        {
            if((temp.data)%2==0)
            {
                if(nn==null)
                {
                    val=nn=temp;
                }
                else
                {
                    val.next = temp;
                    val=temp;
                }
            }
            else
            {
                 temp=temp.next;
            }
           
        }
        val.next=null;
        //val.next=odd;
        //prev.next=null;
        return nn;
    }
*/