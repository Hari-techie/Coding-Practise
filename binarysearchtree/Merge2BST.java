package binarysearchtree;
import java.util.*;
public class Merge2BST {
    static class Node
    {
        int data;
        Node left,right;
    }
    public Node create(Node root,int d)
    {
        if(root==null)
        {
            Node nn = new Node();
            nn.data = d;
            root = nn;
            return root;
        }
        else if(d<root.data)
        {
            root.left = create(root.left,d);
        }
        else
        {
            root.right = create(root.right,d);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    Node head=null,prev=null;
    public Node bst_to_ll(Node root)
    {
        if(root==null)
        {
            return null;
        }
        else
        {
            bst_to_ll(root.left);
            if(head==null)
            {
                head=root;
            }
            else
            {
                root.left = prev;
                prev.right = root;
            }
            prev = root;
            bst_to_ll(root.right);
        }
        return head;
    }
    public static Node merge(Node h1,Node h2)
    {
        if(h1==null)
        {
            return h2;
        }
        if(h2==null)
        {
            return h1;
        }
        Node temp;
        if(h1.data>h2.data)
        {
            temp=h1;
            h1=h2;
            h2=temp;
        }
        Node res=h1,t=null;
        while(h1!=null && h2!=null)
        {
            t=null;
            while(h1!=null && h1.data<=h2.data)
            {
                t=h1;
                h1=h1.right;
            }
            t.right = h2;
            temp = h1;
            h1 =  h2;
            h2 = temp;
        }
        return res;
    }
    public static void print(Node h)
    {
        Node t=h;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.right;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Merge2BST m1 = new Merge2BST();
        Merge2BST m2 = new Merge2BST();
        String a[] = sc.nextLine().split(" ");
        int i,d,n=a.length;
        Node root1 = null,root2=null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root1 = m1.create(root1,d);
        }
        inorder(root1);
        System.out.println("");
        String b[] = sc.nextLine().split(" ");
        int n1=b.length;
        for(i=0;i<n1;i++)
        {
            d = Integer.parseInt(b[i]);
            root2 = m2.create(root2,d);
        }
        inorder(root2);
        System.out.println("");
        Node l1 = m1.bst_to_ll(root1);
        print(l1);
        Node l2 = m2.bst_to_ll(root2);
        print(l2);
        Node m = merge(l1,l2);
        print(m);
    }
}
/*
20 10 30 5 15 25 35
30 20 40 15 25 35 45
*/