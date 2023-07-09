package binarytree;
import java.util.*;
public class PrintLeftRight_IfsumEqualRoot 
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
    static void sum_node(Node root)
    {
        int l=0,r=0,s=0;
        temp = root;
        if(root==null)
        {
            return;
        }
        Queue <Node> q = new LinkedList <Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            t = q.remove();
            if(t.left!=null)
            {
                l = t.left.data;
                q.add(t.left);
            }
            if(t.right!=null)
            {
                r = t.right.data;
                q.add(t.right);
            }
            s = l+r;
            if(s==t.data)
            {
                System.out.println(l+" "+r+" = "+s);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        sum_of_nodes lst = new sum_of_nodes();
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
        sum_node(root);
    }    
}
