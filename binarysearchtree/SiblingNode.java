package binarysearchtree;
import java.util.*;
public class SiblingNode {
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
    public static Node getSibling(Node root,int k)
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
                parent = root;
                root = root.right;
            }
            else
            {
                break;
            }
        }
        if(parent.left!=null && k==parent.left.data)
         {
            return parent.right;
         }
         if(parent.right!=null && k==parent.right.data)
         {
             return parent.left;
         }
        return null;
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
        Node s = getSibling(root,k);
        if(s!=null)
        {
            System.out.println("Sibling Found "+s.data);
        }
        else
        {
            System.out.println("Not found");
        }     
    }
}
