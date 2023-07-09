package binarytree;
import java.util.*;
public class Lowest_Common_Ancester {
    static class Node 
    {
        int data;
        Node left,right;
    }
    static Node create(Node root,int d)
    {
        Node temp = new Node();
        temp.data =d;
        if(root==null)
        {
            root=temp;
            return root;
        }
        Queue <Node> q = new LinkedList<>();
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
            q.add(cur.left);
            if(cur.right==null)
            {
                cur.right=temp;
                break;
            }
            q.add(cur.right);
        }
        return root;
    }
    static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static boolean n1present = false;
    static boolean n2present = false;
    public static Node Lca(Node root,int n1,int n2)
    {
        Node lc = findlcautil(root,n1,n2);
        if(n1present && n2present)
        {
            return lc;
        }
        else
        {
            return null;
        }
    }
    public static Node findlcautil(Node root,int a,int b)
    {
        if(root==null || root.data==0)
        {
            return null;
        }
        if(root.data==a)
        {
            n1present=true;
            return root;
        }
        if(root.data==b)
        {
            n2present=true;
            return root;
        }
        Node leftLca = findlcautil(root.left,a,b);
        Node rightLca = findlcautil(root.right,a,b);
        if(leftLca!=null && rightLca!=null)
        {
            return root;
        }
        return leftLca != null ? leftLca : rightLca;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,l = a.length;
        Node root = null;
        for(i=0;i<l;i++)
        {
            int d = Integer.parseInt(a[i]);
            root=create(root,d);
        }
        preorder(root);
        System.out.println("");
        System.out.println("Enter the nodes of lca");
        int x=sc.nextInt(),y=sc.nextInt();
        Node n = Lca(root,x,y);
        if(n==null)
        {
            System.out.println("There i no common ancester");
        }
        else
        {
            System.out.println(n.data);
        }
    }
}
