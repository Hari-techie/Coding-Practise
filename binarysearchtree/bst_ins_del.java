package binarysearchtree;
import java.util.*;
public class bst_ins_del {
    static class Node
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int d)
    {
        if(root==null)
        {
            Node newnode = new Node();
            newnode.data = d;
            root = newnode;
            return root;
        }
        else if(d<root.data)
        {
            root.left = create(root.left,d);
        }
        else if(d>root.data)
        {
            root.right = create(root.right,d);
        }
        return root;
    }
    static Node delete(Node root,int d)
    {
           if(root==null)
           {
               return root;
           }
           if(d<root.data)
           {
               root.left = delete(root.left,d);
           }
           else if(d>root.data)
           {
               root.right = delete(root.right,d);    // till this it is for traversing till delete node
           }
           else
           {
               if(root.left==null)
               {
                   return root.right;
               }
               else if(root.right==null)
               {
                   return root.left;         // to check if any child node or leaf node is null
               }
               root.data = minvalue(root.right);   // To replace root data value to root right min value
               root.right = delete(root.right,root.data); // To delete replace's node value
           }
           return root;
    }
    static int minvalue(Node root)
    {
        int min = root.data;
        while(root.left!=null)
        {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    static void preorder(Node root)
    {
        Node temp = root;
        if(root==null)
        {
            return;
        }
        else
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,l = a.length;
        Node root = null;
        for(i=0;i<l;i++)
        {
            int d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        delete(root,2);  // 10 5 15 2 7 12 20
        preorder(root);
        System.out.println("");
    }
}
