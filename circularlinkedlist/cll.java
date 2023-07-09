package circularlinkedlist;
import java.util.*;

public class cll {
    Scanner sc = new Scanner(System.in);
    node head,tail,temp,newnode;
    class node
    {
        int data;
        node next;
    }
    void create()
    {
        System.out.print("Enter n value : ");
        int i,n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            newnode=new node();
            System.out.print("Enter value : ");
            newnode.data=sc.nextInt();
            if(head==null)
            {
                head=tail=newnode;
            }
            else
            {
                tail.next=newnode;
                newnode.next=head;
                tail=newnode;
            }
        }
    }
    void display()
    {
        temp=head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data+" ");
    }
    void reverse()
    {
        node front = temp= head,p=tail;
        while(temp.next!=head)
        {
            front = front.next;
            temp.next = p;
            p=temp;
            temp=front;
        }
        temp.next=p;
        head=temp;
        display();
    }
    int size()
    {
        temp=head;
        int c=1;
        while(temp.next!=head)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    void ins_beg()
    {
        newnode = new node();
        System.out.print("Enter value : ");
        newnode.data=sc.nextInt();
        newnode.next=head;
        head=newnode;
        tail.next=head;
        display();
    }
    void ins_end()
    {
        newnode = new node();
        System.out.print("Enter value : ");
        newnode.data=sc.nextInt();
        tail.next=newnode;
        newnode.next =head;
        tail=newnode;
        display();
    }
    void ins_pos()
    {
        System.out.print("Enter position : ");
        int i,pos = sc.nextInt();
        if(pos==1)
        {
            ins_beg();
        }
        else if(pos==size())
        {
            ins_end();
        }
        else
        {
        newnode = new node();
        System.out.print("Enter value : ");
        newnode.data=sc.nextInt();
        node temp=head;
        for(i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        display();
        }
    }
    void del_beg()
    {
        head=head.next;
        tail.next=head;
        System.gc();
        display();
    }
    void del_end()
    {
        temp=head;
        while(temp.next.next!=head)
        {
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
        System.gc();
        display();
    }
    void del_pos()
    {
        System.out.print("Enter position : ");
        int pos = sc.nextInt();
        if(pos==1)
        {
            del_beg();
        }
        else
        {
            int i;
            node p=null,temp=head;
            for(i=1;i<pos;i++)
            {
                p=temp;
                temp=temp.next;
            }
            p.next=temp.next;
            System.gc();
            display();
        }
    }
    public static void main(String[] args) {
        cll lst = new cll();
        lst.create();
        lst.display();
        lst.ins_beg();
        lst.ins_end();
        lst.ins_pos();
//        lst.del_beg();
//        lst.del_end();
//        lst.del_pos();
//        lst.reverse();
    }
}
