package binarysearchtree;
import java.util.*;
public class Array_To_Balanced_BST {
    static class Node
    {
        int data;
        Node left,right;
    }
    public static Node create(Node root,int d)
    {
        if(root==null)
        {
            Node n = new Node();
            n.data = d;
            root = n;
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
     public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static Node bst(int a[],int start,int end)
    {
        if(start > end)
        {
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node();
        node.data = a[mid];
        
        node.left = bst(a,start,mid-1);
        node.right = bst(a,mid+1,end);
        return node;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Node root = bst(a,0,n-1);
        preorder(root);
        System.out.println("");
    }
}
