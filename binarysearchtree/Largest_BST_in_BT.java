package binarysearchtree;

import java.util.*;
/*
Input: 
      5
    /  \
   2    4
 /  \
1    3

Output: 3 
The following subtree is the maximum size BST subtree 
   2  
 /  \
1    3
*/
public class  Largest_BST_in_BT
{
    static Node newnode,temp,t,curr;
     static class Node
    {
        int data;
        Node left,right;
    }
     static class Data
     {
         boolean isbst;
         int size;
         int min;
         int max;
         Data()
         {
             isbst=true;
             size=0;
             min=Integer.MAX_VALUE;
             max=Integer.MIN_VALUE;
         }
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
    public static Data largest(Node root)
    {
        if(root==null || root.data==0)
        {
            return new Data();
        }
        Data leftdata = largest(root.left);
        Data rightdata = largest(root.right);
        Data m= new Data();
        if(leftdata.isbst== false || rightdata.isbst== false || leftdata.max > root.data || rightdata.min <= root.data)
        {
            m.isbst = false;
            m.size = Integer.max(leftdata.size, rightdata.size);
            return m;
        }
        m.isbst = true;
        m.size = leftdata.size + rightdata.size + 1;
        m.min = root.left!=null ? leftdata.min : root.data;
        m.max = root.right!=null ? rightdata.max : root.data;
        return m;
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
        Data res = largest(root);
        System.out.println(res.size);
    }
}
