package singlylinkedlist;
import java.util.*;
public class Merge_Sorted_Lists {
    Scanner sc =new Scanner(System.in);
    Node temp,newnode,head;
    class Node
    {
        int data;
        Node next;
    }
    public Node create()
    {
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Node nn = new Node();
            nn.data = sc.nextInt();  
            if(head==null)
            {
                head = nn;
                temp = head;
            }
            else
            {
                temp.next = nn;
                temp = nn;
            }
        }
        return head;
    }
    public void display(Node h)
    {
        Node t = h;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static Node Merge(Node h1,Node h2)
    {
        Node temp;
        if(h1==null)
        {
            return h2;
        }
        if(h2==null)
        {
            return h1;
        }
        if(h1.data>h2.data)
        {
            temp = h1;
            h1 = h2;
            h2 = temp;
        }
        Node t=null,res = h1;
        while(h1!=null && h2!=null)
        {
            t = null;
            while(h1!=null && h1.data<=h2.data)
            {
                t = h1;
                h1 = h1.next;
            }
            t.next = h2;
            temp = h1;
            h1 =  h2;
            h2 = temp; 
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Merge_Sorted_Lists l1 = new Merge_Sorted_Lists();
        Merge_Sorted_Lists l2 = new Merge_Sorted_Lists();
        Node h1 = l1.create();
        l1.display(h1);
        System.out.println("");
        Node h2 = l2.create();
        l2.display(h2);
        System.out.println("");
        Node merge = Merge(h1,h2);
        l1.display(merge);
        System.out.println("");
    }
}
