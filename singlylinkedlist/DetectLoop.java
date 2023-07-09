package singlylinkedlist;
import java.util.*;
public class DetectLoop {
    static class Node
    {
        int data;
        Node next;
    }
    boolean detect(Node head)
    {
        Node slow = head,fast = head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
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
        boolean flag = lst.detect(head);
        if(flag)
        {
            System.out.println("Loop is detected");
        }
        else
        {
              System.out.println("Loop is not detected");
        }
    }
}
