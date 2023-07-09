package singlylinkedlist;
import java.util.*;
public class intersect
{
    Scanner sc = new Scanner(System.in);
    node head,temp,newnode;
    class node 
    {
        int data;
        node next;
    }
    void create()
    {
        System.out.print("Enter n value : ");
        int i,n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            newnode = new node();
            System.out.print("Enter  value : ");
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
        //return head;
    }
    void display()
    {
        node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("\n");
    }
    static int size(node head)
    {
        int c=0;
        node temp = head;
        while(temp!=null)
        {
            c++;
            temp = temp.next;
        }
        return c;
    }
    static void intersect(node h1,node h2)
    {
        int l1 = size(h1), l2 = size(h2),p,q,i,j;
       // System.out.println(h1.data+" "+h2.data+" h1 h2 intersect");
        node s = h1 , t = h2;
      //  System.out.println(s.data+" "+t.data+" s t");
        for(i=0;i<l1;i++)
        {
            p = s.data;
            t = h2;
            for(j=0;j<l2;j++)
            {
                q = t.data;
                if(p==q)
                {
                    System.out.print(p+" ");
                }
                t = t.next;
            }
            s = s.next;
        }
    }
	public static void main(String[] args) {
		intersect lst1 = new intersect();
		intersect lst2 = new intersect();
		lst1.create();
		lst2.create();
		node h1 = lst1.head;
		node h2 = lst2.head;
	//	System.out.println(h1.data+" "+h2.data+" h1 h2 main");
		intersect(h1,h2);
	}
}
