package binarysearchtree;
import java.util.*;
public class Difference_Bw_OddEven_Level {
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
    public static int diff(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data - diff(root.left) - diff(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" "); 
        int i,n=a.length,d;
        Node root=null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        inorder(root);
        System.out.println("");
        int r = diff(root);
        System.out.println(r);
    }
}
