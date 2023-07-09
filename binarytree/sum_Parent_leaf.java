package binarytree;
import java.util.*;
public class sum_Parent_leaf
{
    Scanner sc = new Scanner(System.in);
    static  Node root,newnode,temp,t;
    static class Node
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int n)
    {
        Node temp = new Node();
        temp.data = n;
        if(root==null)
        {
           root = temp;
           return root;
        }
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            t = q.remove();
            if(t.data== 0)
            {
                continue;
            }
            if(t.left==null)
            {
                t.left = temp;
                break;
            }
            else
            {
                q.add(t.left);
            }
            if(t.right==null)
            {
                t.right=temp;
                break;
            }
            else
            {
                q.add(t.right);
            }
        }
        return root;
    }
    static void inorder(Node root)
    {
        Node t = root;
        if(t==null)
        {
            return;
        }
        else
        {
            System.out.print(t.data+" ");
            inorder(t.left);
            inorder(t.right);
        }
      
    }
    static int sum_p(Node root)
    {
       int parent , l = 0, r = 0;
        if((root.left==null && root.right==null)|| root==null)
        {
            return 0;
        }
        else
        {
            if(root.left!=null)
            {
                l = sum_p(root.left);
            }
            if(root.right!=null)
            {
                r = sum_p(root.right);
            }
        }
        parent = l + r + root.data;
        return parent;
    }
    static int sum_c(Node root)
    {
        int child,l=0,r=0;
        if(root==null)
        {
            return 0;
        }
        if(root.left == null && root.right ==null)
        {
            return root.data;
        }
        else
        {
            if(root.left!=null)
            {
                l = sum_c(root.left);
            }
            if(root.right!=null)
            {
                r = sum_c(root.right);
            }
        }
        child = l + r;
        return child;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        String s[] = sc.nextLine().split(" ");
        int l = s.length;
        for(int i=0;i<l;i++)
        {
            int n = Integer.parseInt(String.valueOf(s[i]));
            root = create(root,n);
        }
        inorder(root);
        System.out.println("");
        System.out.println(sum_p(root));
        System.out.println(sum_c(root));
    }
    
}
