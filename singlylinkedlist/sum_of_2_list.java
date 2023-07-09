package singlylinkedlist;
import java.util.*;
public class sum_of_2_list {
    Node head,temp,newnode;
    Scanner sc = new Scanner(System.in);
    int n;
    static class Node
    {
        int data;
        Node next;
    }
    void create()
    {
        int i,n;
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            newnode=new Node();
            System.out.print("Enter data: ");
            newnode.data=sc.nextInt();
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
        while(temp!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\n");
    }
    int length()
    {
        temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++; 
        }
        return c;
    }
    public static void main(String[]args)
    {
       sum_of_2_list lis1 = new sum_of_2_list();
       sum_of_2_list lis2 = new sum_of_2_list();
     //  sum_of_2_list lis3 = new sum_of_2_list();
       lis1.create();
       lis2.create();
       //if(lis1.length(lis1.head)==lis2.length(lis2.head))
       //{
           int i,n = lis1.length();
          Node newnode;
          Node t1=lis1.head,t2=lis2.head,h=null,temp=null;
           for(i=0;i<n;i++)
           {
              newnode = new Node();
              int s=t1.data+t2.data;
              newnode.data=s;
              if(h==null)
              {
                  temp=h=newnode;
              }
              else
              {
                  temp.next=newnode;
                  temp=newnode;
              }
              t1=t1.next;
              t2=t2.next;
           }
           temp=h;
           while(temp!=null)
           {
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
       //}
       
    }
}
