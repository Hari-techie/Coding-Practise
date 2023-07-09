package binarysearchtree;
import java.util.*;
/*
8 3 10 1 6 14 4 7 13
1 3 4 6 7 8 10 13 14 
6
Found 8
*/
public class Inorder_Parent {
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
    public static Node getParent(Node root,int k)
    {
        if(root==null)
        {
            return null;
        }
        Node parent = null;
        while(root!=null)
        {
            if(k<root.data)
            {
                parent = root;
                root = root.left;
            }
            else if(k>root.data)
            {
                root = root.right;
            }
            else
            {
                break;
            }
        }
        return parent;
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
        Node p = getParent(root,k);
        if(p!=null)
        {
            System.out.println("Found "+p.data);
        }
        else
        {
            System.out.println("Not found");
        }     
    }
}
