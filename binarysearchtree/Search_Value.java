package binarysearchtree;
import java.util.*;
public class Search_Value {
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
    public static boolean found(Node root,int k)
    {
        if(root==null)
        {
            return false;
        }
        while(root!=null)
        {
            if(k<root.data)
            {
                root = root.left;
            }
            else if(k>root.data)
            {
                root = root.right;
            }
            else
            {
                return true;
            }
        }
        return false;
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
        int k = sc.nextInt();
        if(found(root,k))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }     
    }
}
