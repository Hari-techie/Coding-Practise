package binarysearchtree;
import java.util.*;
public class BST_To_Sorted_DLL {
    static class Node
    {
        int data;
        Node left,right;
    }
    public static Node create(Node root,int d)
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
    static Node prev,head;
    public static void dll(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            dll(root.left);
            if(prev==null)
            {
                head = root;
            }
            else
            {
                root.left = prev;
                prev.right = root;
            }
            prev = root;
            dll(root.right);
        }
    }
    public static void print(Node head)
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t = t.right;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i, n = a.length, d;
        Node root = null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        inorder(root);
        System.out.println("");
        dll(root);
        print(head);
    }
}

