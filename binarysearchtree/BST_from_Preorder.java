package binarysearchtree;
import java.util.*;
public class BST_from_Preorder {
    static class Node
    {
        int data;
        Node left,right;
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
    public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static Node create(int a[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        Node n = new Node();
        n.data = a[start];
        int i;
        for(i=start+1;i<=end;i++)
        {
            if(a[i]>n.data)
            {
                break;
            }
        }
        n.left = create(a,start+1,i-1);
        n.right = create(a,i,end);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        Node root = create(a,0,n-1);
        inorder(root);
        System.out.println("");
    }
}
