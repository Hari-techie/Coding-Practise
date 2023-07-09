package binarytree;

import java.util.*;

public class BtInsDel 
{
    static Scanner sc = new Scanner(System.in);
    static Node head,temp,cur,newnode;
    static class Node
    {
        String data;
        Node left,right;
        Node(String data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static Node create(Node root,String d)  // A B C D N N E N F G
    {
        Node temp = new Node(d);
       // temp.data = d;
        if(root==null)
        {
            root = temp;
            return root;
        }
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);   // A
        while(!q.isEmpty())
        {
            cur = q.remove(); // A
            if(cur.data.equals("N"))
            {
                continue;
            }
            if(cur.left==null)
            {
                cur.left = temp;
                break;
            }
            else
            {
                q.add(cur.left);
            }
            if(cur.right==null)
            {
                cur.right = temp;
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
        Node tp = root;
        if(tp==null)
        {
            return ;
        }
        else
        {
            System.out.print(tp.data+" ");
            preorder(tp.left);
            preorder(tp.right);
        }
    }
    static void delete(Node root,String d)
    {
        Node delNode = null,t = null;
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            if(root.data.equals(d))
            {
                root = null;
                return;
            }
            else
            {
                return;
            }
        }
        Queue <Node> q = new LinkedList <Node> ();
        q.add(root);
        while(!q.isEmpty())
        {
            t = q.remove();
            if(t.data.equals(d))
            {
                delNode = t;
            } 
            if(t.left!=null)
            {
                q.add(t.left);
            }
            if(t.right!=null)
            {
                q.add(t.right);
            }
        }
        
        if(delNode!=null)
        {
            String b = t.data;
            // System.out.println("TEMP : "+t.data);
           // delRightMost(root,b);
            t.data = null;
            delNode.data = b;
        }
        
    }
    static void delRightMost(Node root,String b)
    {
        Node temp = null;
        Queue <Node> q = new LinkedList <Node> ();
        q.add(root);
        while(!q.isEmpty())
        {
            temp = q.remove();
            if(temp.data.equals(b))
            {
                temp = null;
                return;
            }
            if(temp.right!=null)
            {
                if(temp.right.data.equals(b))
                {
                    temp.right = null;
                    return;
                }
                else
                {
                    q.add(temp.right);
                }
            }
            if(temp.left!=null)
            {
                if(temp.left.data.equals(b))
                {
                    temp.left = null;
                    return;
                }
                else
                {
                    q.add(temp.left);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        String s = sc.nextLine();
        String a[] = s.split(" ");  // A B N C D 
        Node root = null;
        for(int i=0;i<a.length;i++)
        {
           root = create(root,a[i]);
        }
        preorder(root);
        System.out.println("");
        delete(root,"C");
        preorder(root);
        System.out.println("");
    }
}
//IP: A B C D N N E N F G
// OP: A B D N F N G N E 