package binarysearchtree;
import java.util.*;
public class Closet_Element {
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
    public static Node closet(Node root,int k)
    {
        if(root==null)
        {
            return null;
        }
        int mindif = Integer.MAX_VALUE;
        Node res = null;
        while(root!=null)
        {
            int curdif = Math.abs(root.data-k);
            if(curdif<mindif)
            {
                mindif = curdif;
                res = root;
            }
            if(k<root.data)
            {
                root = root.left;
            }
            else if(k>root.data)
            {
                root = root.right;
            }
            else
            {
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,d,n=a.length;
        Node root = null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        inorder(root);
        System.out.println("");
        int k = sc.nextInt();
        Node r = closet(root,k);
        if(r!=null)
        {
            System.out.println(r.data);
        }
    }
}
