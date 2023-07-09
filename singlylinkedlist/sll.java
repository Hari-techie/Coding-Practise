package singlylinkedlist;
import java.util.*;

public class sll {
    Node head,temp,newnode;
    Scanner sc = new Scanner(System.in);
    class Node 
    {
        int data;
        Node next;
    }
    void create()
    {
        System.out.print("Enter n value : ");
        int i,n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            newnode = new Node();
            System.out.print("Enter value : ");
            newnode.data = sc.nextInt();
            if(head==null)
            {
                temp=head=newnode;
            }
            else
            {
                temp.next=newnode;
                temp=newnode;
            }
        }
    }
    void display()
    {
        temp=head;
        while(temp!=null)
        {
             System.out.print(temp.data+" ");
             temp=temp.next;
        }
        System.out.print("\n");
    }
    void reverse()
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
        display();
    }
    void ins_at_begin()
    {
        newnode = new Node();
        System.out.print("Enter  value : ");
        newnode.data=sc.nextInt();
        newnode.next=head;
        head=newnode;
        display();
    }
    void ins_at_pos()
    { 
         System.out.print("Enter position : ");
         int i=1,pos = sc.nextInt();
         if(pos==1)
         {
             ins_at_begin();
         }
         else
         {
         temp=head;
         Node prev=null;
         for(i=1;i<pos;i++)
         {
             prev = temp;
             temp=temp.next;
         }
         newnode = new Node();
         System.out.print("Enter  value : ");
         newnode.data=sc.nextInt();
         prev.next=newnode;
         newnode.next=temp;
         display();
         }
    }
    void ins_end()
    {
        newnode = new Node();
        System.out.print("Enter  value : ");
        newnode.data=sc.nextInt();
        temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        display();
    }
    void del_beg()
    {
        temp=head;
        head=head.next;
        System.gc();
        display();
    }
    void del_pos()
    {
        System.out.print("Enter position : ");
        int i,pos = sc.nextInt();
        if(pos==1)
        {
            del_beg();
        }
        else
        {
            temp=head;
            Node back=null;
            for(i=1;i<pos;i++)
            {
                back=temp;
                temp=temp.next;
            }
            back.next=temp.next;
            System.gc();
            display();
        }
    }
    void del_end()
    {
        temp=head;
        Node back=null;
        while(temp.next!=null)
        {
            back=temp;
            temp=temp.next;
        }
        back.next=null;
        System.gc();
        display();
    }
    public static void main(String[]args)
    {
        sll list = new sll();
        list.create();
        list.display();
        //list.reverse();
     //   list.ins_at_begin();
       // list.ins_at_pos();
       // list.ins_end();
          list.del_beg();
          list.del_pos();
          list.del_end();
    }
}
