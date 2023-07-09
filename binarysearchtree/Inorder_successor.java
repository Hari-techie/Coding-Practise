package binarysearchtree;
import java.util.*;
public class Inorder_successor {
    static class Node
    {
        int data;
        Node left,right;
    }
    public static Node create(Node root,int d)
    {
        if(root==null)
        {
            Node nn = new Node();
            nn.data = d;
            root = nn;
            return root;
        }
        else if(d<root.data)
        {
            root.left = create(root.left,d);
        }
        else
        {
            root.right = create(root.right,d);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static Node success(Node root,int v)
    {
        if(root==null)
        {
            return null;
        }
        Node suc = null;
        while(root!=null)
        {
            if(v<root.data)
            {
                suc = root;
                root = root.left;
            }
            else if(v>root.data)
            {
                root = root.right;
            }
            else
            {
                if(root.right!=null)
                {
                    suc = getsuc(root);
                }
                break;
            }
        }
        return suc;
    }
    public static Node getsuc(Node r)
    {
        if(r==null)
        {
            return null;
        }
        Node t = r.right;
        while(t.left!=null)
        {
            t=t.left;
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int d,i, n = a.length;
        Node root = null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        inorder(root);
        System.out.println("");
        int k = sc.nextInt();
        Node s = success(root,k);
        if(s==null)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println(s.data);
        }
    }
}
