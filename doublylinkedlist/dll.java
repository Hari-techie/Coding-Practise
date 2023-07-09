package doublylinkedlist;
import java.util.*;
public class dll 
{
    node head,tail,newnode,temp;
    Scanner sc = new Scanner(System.in);
    class node
    {
        int data;
        node prev;
        node next;
    }
    void create()
    {
        int n,i;
        node back = null;
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            newnode = new node();
            newnode.next=null;
            System.out.print("Enter  value : ");
            newnode.data=sc.nextInt();
            if(head==null)
            {
                head=temp=newnode;
            }
            else
            {
                newnode.prev=temp;
                newnode.next=null;
                temp.next=newnode;
                tail=temp=newnode;
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
        temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.print("\n");
    }
    int count()
    {
        temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    void add_at_beg()
    {
        newnode = new node();
        System.out.print("Enter  value : ");
        newnode.data=sc.nextInt();
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        display();
    }
    void add_pos()
    {
        System.out.print("Enter position : ");
        int pos = sc.nextInt();
        if(pos==1)
        {
            add_at_beg();
        }
        else if(pos==count())
        {
            add_end();
        }
        else
        {
            int i;
            temp=head;
            newnode = new node();
            node back = null;
            System.out.print("Enter value : ");
            newnode.data = sc.nextInt();
            for(i=1;i<pos;i++)
            {
                back=temp;
                temp=temp.next;
            }
            back.next= newnode;
            newnode.prev = back;
            newnode.next = temp;
            temp.prev=newnode;
            display();
        }
    }
   
    void add_end()
    {
        newnode = new node();
        System.out.print("Enter  value : ");
        newnode.data = sc.nextInt();
        tail.next=newnode;
        newnode.prev = tail;
        tail=newnode;
        display();
    }
    void del_beg()
    {
        head=head.next;
        head.prev=null;
        System.gc();
        display();
    }
    void del_pos()
    {
        int pos;
        System.out.print("Enter position : ");
        pos = sc.nextInt();
        if(pos==1)
        {
            del_beg();
        }
        else if(pos==count())
        {
            del_end();
        }
        else
        {
           int i;
           temp=head;
           for(i=1;i<pos;i++)
           {
               temp=temp.next;
           }
           temp.prev.next=temp.next;
           temp.next.prev=temp.prev;
           System.gc();
           display();
        }
    }
    void del_end()
    {
         tail=tail.prev;
         tail.next=null;
         System.gc();
         display();
    }
    public static void main(String [] args)
    {
        dll list = new dll();
        list.create();
        list.display();
       // list.reverse();
//        list.add_at_beg();
//        list.add_pos();
//        list.add_end();
//        list.del_beg();
//        list.del_pos();
//        list.del_end();
//        list.reverse();
    }
}
