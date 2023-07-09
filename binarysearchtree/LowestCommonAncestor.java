package binarysearchtree;
import java.util.*;
public class LowestCommonAncestor {
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
    public static Node lca(Node root,int a,int b)
    {
        if(root==null)
        {
            return null;
        }
        while(root!=null)
        {
            if(a<root.data && b<root.data)
            {
                root = root.left;
            }
            else if(a>root.data && b>root.data)
            {
                root = root.right;
            }
            else
            {
                break;
            }
        }
        return root;
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
        int k = sc.nextInt(),l = sc.nextInt();
        Node p = lca(root,k,l);
        if(p!=null)
        {
            System.out.println(p.data);
        }
    }
}
