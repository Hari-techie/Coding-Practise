package binarysearchtree;
import java.util.*;
public class Check_SumPair_Exists {
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
    public static void preorder(Node root)
    {
        Node t = root;
        if(t!=null)
        {
            System.out.print(t.data+" ");
            preorder(t.left);
            preorder(t.right);
        }
    }
    public static void inorder(Node root,ArrayList <Integer> b)
    {
        Node t = root;
        if(t!=null)
        {
            inorder(t.left,b);
            b.add(t.data);
            inorder(t.right,b);
        }
    }
    public static boolean issumpair(Node root,int k,HashSet <Integer> h)
    {
        if(root==null)
        {
            return false;
        }
        if(h.contains(k-root.data))
        {
            return true;
        }
        h.add(root.data);
        if(issumpair(root.left,k,h))
        {
            return true;
        }
        return issumpair(root.right,k,h);
    }
    public static boolean sumexists(Node root,ArrayList <Integer> p,int k)
    {
        int s=0,e=p.size()-1;
        int cursum = 0;
        while(s<e)
        {
            cursum = p.get(s) + p.get(e);
            if(cursum==k)
            {
                return true;
            }
            else if(cursum<k)
            {
                s++;
            }
            else
            {
                e--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int i,d,l = a.length;
        Node root = null;
        for(i=0;i<l;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        preorder(root);
        System.out.println("");
        HashSet<Integer> h = new HashSet <>();
        System.out.println("Enter the sum value :");
        int k = sc.nextInt();
        boolean v = issumpair(root,k,h);
        if(v)
        {
            System.out.println("Pair found");
        }
        else
        {
            System.out.println("Pair not found");
        }
        ArrayList <Integer> al = new ArrayList <> ();
        inorder(root,al);
        boolean b = sumexists(root,al,k);
        System.out.println(b);
    }
}
