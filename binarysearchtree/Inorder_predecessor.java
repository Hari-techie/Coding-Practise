package binarysearchtree;
import java.util.*;
public class Inorder_predecessor {
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
    public static Node Predecess(Node root,int val)
    {
        if(root==null)
        {
            return null;
        }
        Node pr = null;
        while(root!=null)
        {
            if(val< root.data)
            {
                root = root.left;
            }
            else if(val > root.data)
            {
                pr = root;
                root = root.right;
            }
            else
            {
                if(root.left!=null)
                {
                    pr = getPred(root);
                }
                break;
            }
        }
        return pr;
    }
    public static Node getPred(Node r)
    {
        if(r==null)
        {
            return null;
        }
        Node t = r.left;
        while(t.right!=null)
        {
            t = t.right;
        }
        return t;
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
        inorder(root);
        System.out.println("");
        int k = sc.nextInt();
        Node p = Predecess(root,k);
        if(p==null)
        {
            System.out.println("No Predecessor");
        }
        else
        {
            System.out.println(p.data);
        }
    }
}
