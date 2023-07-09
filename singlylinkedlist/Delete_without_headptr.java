package singlylinkedlist;
public class Delete_without_headptr {
    static class Node
    {
        int data;
        Node next;
    }
    void delete(Node p)
    {
        p.data = p.next.data;
        p.next = p.next.next;
    }
    void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Delete_without_headptr lst = new Delete_without_headptr();
        int a[] = {1,2,3,4,5,6};
        int i;
        Node head=null,newnode,temp=null,del=null;
        for(i=0;i<a.length;i++)
        {
            newnode = new Node();
            newnode.data = a[i];
            if(head==null)
            {
                head=temp=newnode;
            }
            else
            {
                temp.next = newnode;
                temp = newnode;
                if(i==2)
                {
                    del = temp;
                }
            }
        }
        lst.display(head);
        lst.delete(del);
        lst.display(head);
    }
}
