package binarysearchtree;
import java.util.*;
public class BST_to_greater_sum_tree {
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
    static int sum=0;
    public static Node bst(Node root)
    {
        if(root==null)
        {
            return null;
        }
        bst(root.right);
        sum+=root.data;
        root.data=sum;
        bst(root.left);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,d,n=a.length;
        Node root = null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        inorder(root);
        System.out.println("");
        Node res = bst(root);
        inorder(res);
        System.out.println("");
    }
}
