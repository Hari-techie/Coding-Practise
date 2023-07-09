package binarytree;
import java.util.*;

public class NoOfLeaf
{
    static Node newnode,temp,t,curr;
     static class Node
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int d)
    {
        Node curr,temp = new Node();
        temp.data = d;
        if(root==null)
        {
            root = temp;
            return root;
        }
        Queue <Node> q = new LinkedList <Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            curr = q.remove();
            if(curr.data==0)
            {
                continue;
            }
            if(curr.left==null)
            {
                curr.left = temp;
                break;
            }
            else
            {
                q.add(curr.left);
            }
            if(curr.right==null)
            {
                curr.right = temp;
                break;
            }
            else
            {
                q.add(curr.right);
            }
        }
        return root;
    }
    static void preorder(Node root)
    {
        Node tp = root;
        if(tp==null)
        {
            return;
        }
        else
        {
            System.out.print(tp.data+" ");
            preorder(tp.left);
            preorder(tp.right);
        }
    }
    static int noOfLeafNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return noOfLeafNode(root.left)+noOfLeafNode(root.right);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,n = a.length;
        Node root = null;
        for(i=0;i<n;i++)
        {
            int d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        System.out.println(noOfLeafNode(root));
    }
}
