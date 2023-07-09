package binarysearchtree;
import java.util.*;
public class PrintNodesInRange {
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
    public static void count(Node root,int min,int max)
    {
        if(root==null)
        {
            return;
        }
        if(min<root.data)
        {
             count(root.left,min,max);
        }
        if(root.data>=min && root.data<=max)
        {
            System.out.print(root.data+" ");
        }
        if(max>root.data)
        {
             count(root.right,min,max);
        }
       
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
        int mn = sc.nextInt(),mx = sc.nextInt();
        count(root,mn,mx);
        System.out.println("");
    }
}

