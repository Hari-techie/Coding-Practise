package binarytree;
import java.util.*;
public class Bottom_view {
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
    static void topview(Node root)
    {
        if(root==null)
        {
            return;
        }
        TreeMap<Integer,Integer> tr = new TreeMap<>();
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node p = q.remove();
            int h = p.height;
            tr.put(h, p.data);
            if(p.left!=null)
            {
                p.left.height = h-1;
                q.add(p.left);
            }
            if(p.right!=null)
            {
                p.right.height = h+1;
                q.add(p.right);
            }
        }
        System.out.println(tr.values());
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
        topview(root);
    }
}
