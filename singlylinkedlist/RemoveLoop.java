package singlylinkedlist;
import java.util.*;
public class RemoveLoop {
    static class Node
    {
        int data;
        Node next;
    }
    static Node deleteloop(Node slow,Node head)
    {
        Node ptr1 = head,ptr2;
        while(1==1)
        {
            ptr2 = slow;
            while(ptr2.next!=slow && ptr2.next!=ptr1)
            {
                ptr2 = ptr2.next;
            }
            if(ptr2.next==ptr1)
            {
                break;
            }
            ptr1 = ptr1.next;
        }
        ptr2.next=null;
        return head;
    }
    static Node removeloop(Node head)
    {
        Node slow=head,fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
               return deleteloop(slow,head);
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int i,n = 5;
        DetectLoop lst = new DetectLoop();
        Node head=null,temp=null,newnode=null,tail=null;
        for(i=0;i<n;i++)
        {
            newnode = new Node();
            newnode.data = a[i];
            if(head==null)
            {
                head = temp = newnode;
            }
            else
            {
                temp.next = newnode;
                tail = temp = newnode;
            }
        }
        temp = head;
        for(i=0;i<3;i++)
        {
            temp = temp.next;
        }
        tail.next = temp;
        temp = removeloop(head);
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
}
