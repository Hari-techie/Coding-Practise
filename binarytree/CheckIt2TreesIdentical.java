package binarytree;
import java.util.*;
public class CheckIt2TreesIdentical {
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
   static boolean IsIdentical(Node root1,Node root2)
   {
       if(root1==null && root2==null)
       {
           return true;
       }
       if(root1==null || root2==null)
       {
           return false;
       }
       return root1.data==root2.data && IsIdentical(root1.left,root2.left)&& IsIdentical(root1.right,root2.right);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root1 = null,root2 = null;
        System.out.println("Enter 1st tree values");
        String a[] = sc.nextLine().split(" ");
        sc.nextLine();
        int i,n = a.length;
        for(i=0;i<n;i++)
        {
            int d = Integer.parseInt(a[i]);
            root1 = create(root1,d);
        }
        System.out.println("Enter 2nd tree values");
        String b[] = sc.nextLine().split(" ");
        sc.nextLine();
        int n1 = b.length;
        for(i=0;i<n1;i++)
        {
            int d = Integer.parseInt(b[i]);
            root2 = create(root2,d);
        }
        System.out.println("1st tree values");
        preorder(root1);
        System.out.println("");
        System.out.println("2nd tree values");
        preorder(root2);
        System.out.println("");
        System.out.println(IsIdentical(root1,root2));
    }
}
