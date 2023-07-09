package binarytree;
import java.util.*;
public class LevelOrderTraversal {
    Node root;
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
            root= temp;
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
                cur.right= temp;
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
        Node t = root;
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
    static int height(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        return max(height(root.left),height(root.right))+1;
    }
    static int max(int a, int b)
    { 
        int mx = a>b?a:b;
        return mx;
    }
    static void printLevelNodes(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        printLevelNodes(root.left,level-1);
        printLevelNodes(root.right,level-1);
    }
    static void printLevelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        int i,h = height(root);
        for(i=0;i<=h;i++)
        {
            printLevelNodes(root,i+1);
            System.out.println("");
        }
    }
    static void printLevelOrderUsingQueue(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue <Node> q = new LinkedList <Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node p = q.remove();
            System.out.print(p.data+" ");
            if(p.left!=null)
            {
                q.add(p.left);
            }
            if(p.right!=null)
            {
                q.add(p.right);
            }
        }
    }
    static void printLevelOrderUsingQueueLevelByLevel(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue <Node> q = new LinkedList <Node>();
        q.add(root);
        while(true)
        {
            int size = q.size();
            if(size==0)
            {
                break;
            }
        while(size>0)
        {
            Node p = q.remove();
            System.out.print(p.data+" ");
            if(p.left!=null)
            {
                q.add(p.left);
            }
            if(p.right!=null)
            {
                q.add(p.right);
            }
            size--;
        }
          System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        String a[] = sc.nextLine().split(" ");
        int i, n = a.length;
        for(i=0;i<n;i++)
        {
            int d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        printLevelOrder(root);
        System.out.println("");
        printLevelOrderUsingQueue(root);
        System.out.println("");
        printLevelOrderUsingQueueLevelByLevel(root);
        System.out.println("");
    }
}
