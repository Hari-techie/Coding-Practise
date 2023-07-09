package binarytree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ChechIfHeightBalanced {
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
        Queue <Node> q = new LinkedList<>();
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
            q.add(cur.left);
            if(cur.right==null)
            {
                cur.right=temp;
                break;
            }
            q.add(cur.right);
        }
        return root;
    }
    static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static int IfBalanced(Node root)
    {
        if(root==null || root.data==0)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        int lh = IfBalanced(root.left);
        int rh = IfBalanced(root.right);
        if(lh==-1 || rh==-1 || Math.abs(lh-rh)>1)
        {
            return -1;
        }
        return Math.max(rh, lh)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,l = a.length;
        Node root=null;
        for(i=0;i<l;i++)
        {
            int d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        int b = IfBalanced(root);
        if(b!=-1)
        {
            System.out.println("Balanced");
        }
        else
        {
             System.out.println("Not balanced");
        }
    }
}
