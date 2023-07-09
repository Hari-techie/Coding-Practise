package binarytree;
import java.util.*;
public class DiameterOfTree {
    static int diameter;
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
        Queue<Node>q = new LinkedList<>();
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
    public static  void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public int getDiameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        int lh = getDiameter(root.left);
        int rh = getDiameter(root.right);
        diameter = Math.max(rh+lh+1,diameter);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiameterOfTree dt = new DiameterOfTree();
        String s[] = sc.nextLine().split(" ");
        int i,l = s.length;
        Node root = null;
        for(i=0;i<l;i++)
        {
            int d = Integer.parseInt(s[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        dt.getDiameter(root);
        System.out.println(diameter);
    }
}
