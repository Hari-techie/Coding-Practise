package binarysearchtree;
import java.util.*;
public class kth_Largest_Element {
    static class Node
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int d)
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
    static void preorder(Node root)
    {
        Node t=root;
        if(t!=null)
        {
            System.out.print(t.data+" ");
            preorder(t.left);
            preorder(t.right);
        }
    }
    static int count = 0;
    public static Node kthlarge(Node root,int k)
    {
        if(root==null)
        {
            return root;
        }
        Node Right = kthlarge(root.right,k);
        if(Right!=null)
        {
            return Right;
        }
        count++;
        if(count==k)
        {
            return root;
        }
        return kthlarge(root.left,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,n = a.length,d;
        Node root = null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        System.out.println("Enter k value : ");
        int k = sc.nextInt();
        int mx = kthlarge(root,k).data;
        System.out.println("Kth largest is "+mx);
    }
}
