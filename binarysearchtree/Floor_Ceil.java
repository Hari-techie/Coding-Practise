package binarysearchtree;
import java.util.*;
public class Floor_Ceil {
    static class Node
    {
        int data;
        Node left,right;
    }
    public static Node create(Node root,int d)
    {
        if(root==null)
        {
            Node n = new Node();
            n.data = d;
            root = n;
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
    public static List<Node> getfc(Node root,int v)
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        Node floor = null;
        Node ceil = null;
        while(root!=null)
        {
            if(root.data<v)
            {
                floor = root;
                root = root.right;
            }
            else if(root.data>v)
            {
                ceil = root;
                root = root.left;
            }
            else
            {
                floor = ceil = root;
                break;
            }
        }
        List <Node> li = new ArrayList<>();
        li.add(floor);
        li.add(ceil);
        return li;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" "); 
        int i,n=a.length,d;
        Node root=null;
        for(i=0;i<n;i++)
        {
            d = Integer.parseInt(a[i]);
            root = create(root,d);
        }
        inorder(root);
        System.out.println("");
        int k = sc.nextInt();
        List <Node> l = getfc(root,k);
        System.out.println((((l.get(0).data+l.get(1).data))/2));
        if(l.get(0)!=null)
        {
            System.out.println(l.get(0).data);
        }
        else
        {
            System.out.println("Ceil not found");
        }
        if(l.get(1)!=null)
        {
            System.out.println(l.get(1).data);
        }
        else
        {
            System.out.println("Floor not found");
        }
    }
}
