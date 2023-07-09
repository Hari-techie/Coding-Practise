package binarysearchtree;
import java.util.*;
public class Check_if_Bst {
    static class Node
    {
        int data,height;
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
        Queue<Node> q = new LinkedList <>();
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
            q.add(cur.left);
            if(cur.right==null)
            {
                cur.right = temp;
                break;
            }
            q.add(cur.right);
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
    static boolean isBst(Node root,Node prevLeft,Node prevRight)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data!=0 && prevLeft!=null && root.data>=prevLeft.data)
        {
            return false;
        }
        if(root.data!=0 && prevRight!=null && root.data<=prevRight.data)
        {
            return false;
        }
        return isBst(root.left,root,prevRight) && isBst(root.right,prevLeft,root);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int i,l = s.length;
        Node root=null;
        for(i=0;i<l;i++){
            int d = Integer.parseInt(s[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        if(isBst(root,null,null))
        {
            System.out.println("Given tree is a BST");
        }
        else
        {
             System.out.println("Given tree is not a BST");
        }
    }
}
