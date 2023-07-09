package binarytree;
import java.util.*;
public class LevelOfGivenKey {
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
    static int LevelOfNode(int key,Node root,int level)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.data==key)
        {
            return level;
        }
        int l = LevelOfNode(key,root.left,level+1);
        if(l!=0)
        {
            return l;
        }
        l = LevelOfNode(key,root.right,level+1);
        return l;
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
        System.out.println(LevelOfNode(8,root,1));
    }
}
