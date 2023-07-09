package binarysearchtree;
import java.util.*;
public class kth_Smalest_Element {
    static class Node
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int d)
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
    static void preorder(Node root)
    {
        Node t=root;
        if(t!=null)
        {
            System.out.print(t.data+" ");
            preorder(t.left);
            preorder(t.right);
        }
    }
    static int count = 0;
    public static Node kthsmall(Node root,int k)
    {
        if(root==null)
        {
            return root;
        }
        Node Left = kthsmall(root.left,k);
        if(Left!=null)
        {
            return Left;
        }
        count++;
        if(count==k)
        {
            return root;
        }
        return kthsmall(root.right,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,n = a.length,d;
        Node root = null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        System.out.println("Enter k value : ");
        int k = sc.nextInt();
        int mx = kthsmall(root,k).data;
        System.out.println("Kth smallest is "+mx);
    }
}
