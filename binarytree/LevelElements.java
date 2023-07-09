package binarytree;
import java.util.*;
public class LevelElements {
    static Node root,temp;
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
            root=temp;
            return root;
        }
        Queue <Node> q = new LinkedList <>();
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
                cur.left = temp;
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
    static void LevelEle(Node root,int lvl)
    {
        if(root==null)
        {
            return;
        }
        if(lvl==1)
        {
            System.out.print(root.data+" ");
            return;
        }
        LevelEle(root.left,lvl-1);
        LevelEle(root.right,lvl-1);
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
        LevelEle(root,3);
        System.out.println("");
    }
}
