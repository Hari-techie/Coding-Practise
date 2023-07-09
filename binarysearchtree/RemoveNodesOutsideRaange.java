package binarysearchtree;
import java.util.*;
public class RemoveNodesOutsideRaange {
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
    public static Node remove(Node root,int min,int max)
    {
        if(root==null)
        {
            return null;
        }
        root.left = remove(root.left,min,max);
        root.right = remove(root.right,min,max);
        if(root.data<min)
        {
            return root.right;
        }
        else if(root.data>max)
        {
            return root.left;
        }
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
        int mn = sc.nextInt(),mx = sc.nextInt();
        Node r = remove(root,mn,mx);
        inorder(r);
        System.out.println("");
        
    }
}

