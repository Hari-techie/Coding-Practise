package binarysearchtree;
import java.util.*;
public class Min_Max {
    static class Node
    {
        int data;
        Node left,right;
    }
   static Node create(Node root,int d)
    {
        if(root==null)
        {
            Node newnode = new Node();
            newnode.data = d;
            root = newnode;
            return root;
        }
        else if(d<root.data)
        {
            root.left = create(root.left,d);
        }
        else if(d>root.data)
        {
            root.right = create(root.right,d);
        }
        return root;
    }
     static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static int max(Node root)
    {
        if(root==null)
        {
            System.out.println("Empty tree");
            return 0;
        }
        else
        {
            Node temp = root;
            while(temp.right!=null)
            {
                temp = temp.right;
            }
            return temp.data;
        }
    }
    static int min(Node root)
    {
        if(root!=null)
        {
            while(root.left!=null)
            {
                root = root.left;
            }
        }
        return root.data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,d,n=a.length;
        Node root=null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        int mx = max(root);
        System.out.println("Max is "+mx);
        int mn = min(root);
        System.out.println("Min is "+mn);
    }
}
