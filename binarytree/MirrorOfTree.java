package binarytree;
import java.util.*;
public class MirrorOfTree {
    static class Node
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int d)
    {
        Node temp = new Node();
        temp.data = d;
        if(root==null)
        {
            root = temp;
            return root;
        }
        Queue <Node> q = new LinkedList <Node> ();
        q.add(root);
        while(!q.isEmpty())
        {
            Node cur = q.remove();
            if(cur.data==0)
            {
                continue;
            }
            if(cur.left==null)
            {
                cur.left=temp;
                break;
            }
            else
            {
                q.add(cur.left);
            }
            if(cur.right==null)
            {
                cur.right=temp;
                break;
            }
            else
            {
                q.add(cur.right);
            }
        }
        return root;
    }
    static void preorder(Node root)
    {
        Node t= root;
        if(t==null)
        {
            return;
        }
        else
        {
            System.out.print(t.data+" ");
            preorder(t.left);
            preorder(t.right);
        }
    }
    static void mirror(Node root)
    {
        if(root==null)
        {
            return ;
        }
        Node s = root.left;
        root.left = root.right;
        root.right = s;
        mirror(root.left);
        mirror(root.right);
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        String a[] = sc.nextLine().split(" ");
        int i,n = a.length;
        for(i=0;i<n;i++)
        {
            int d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        mirror(root);
        preorder(root);
        System.out.println("");
    }
}
