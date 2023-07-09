package binarytree;

import java.util.*;

/*public class Bin_tree {
      static class Node
    {
        String data;
        Node left,right;

        Node(String data)
        {
            this.data=data;
            left=right=null;
        }
    }
    
    static Node insert(Node root,String data)
    {
         Queue <Node> q = new LinkedList <Node>();                 //A B C D E N N F G N N

        Node temp=new Node(data);                           //data=D
        Node curr;

        if(root==null)
        {
            root=temp;
            return root;                                   //root=A
        }
        q.add(root);                                      //q= A
        while(!q.isEmpty())
        {
            curr=q.remove();                              //curr = A

            if(curr.data.equals("N"))
            continue;

            if(curr.left==null)                         //A.left!=null
            {
                curr.left=temp;
                break;
            }
            else
            q.add(curr.left);                          //q = B

            if(curr.right==null)                      //A.left=null && 
            {
                curr.right=temp;                     //A.right = C
                break;
            }
            else
            q.add(curr.right);                      //q= B C

        }
                                 
        return root;
    }
    public static void main(String[]args)
    {
        Node root=null;
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        root=insert(root,arr[i]);

        //vertical_order(root);
    }
}

*/


public class Bin_tree {
    static class Node{
        String data;
        Node left,right;
        Node(String da)
        {
            this.data=da;
            left=right=null;
        }
    }
    
    public static Node create(Node root,String d)
    {
        Node temp=new Node(d);
        Node curr;
        
        Queue <Node> q=new LinkedList<>();
        
        if(root==null)
        {
            root=temp;
            return root;
        }
        q.add(root);
        
        while(!q.isEmpty())
        {
            curr=q.remove();
            
            if(curr.data.equals("N"))
            {
                continue;
            }
            
            if(curr.left==null)
            {
                curr.left=temp;
                break;
            }
            else{
                q.add(curr.left);
            }
            
            if(curr.right==null)
            {
                curr.right=temp;
                break;
            }
            else{
                q.add(curr.right);
            }
            
        }
        return root;
    }
    
    public static void preorder(Node root)
    {
        Node temp=root;
        if(temp!=null)
        {
            System.out.print(temp.data+" ");
            preorder(temp.left);
            preorder(temp.right);
        }
        else{
            return;
        }
    }
    
    public static void delete(Node root,String d)
    {
       // Node temp=new Node(d);
        Node t=null,keyNode=null;
        Queue <Node> q=new LinkedList<>();
        if(root==null)
        {
            return ;
        }
        
            if(root.left==null && root.right==null)
            {
                if(root.data.equals(d))
                {
                    return;
                }
                else{
                    return;
                }
            }
           
                q.add(root); 
            
            while(!q.isEmpty())
            {
               t=q.remove();
               
               if(t.data.equals(d))
               {
                   keyNode=t;
               }
               
               if(t.left!=null)
               {
                   q.add(t.left);
               }
               
               if(t.right!=null)
               {
                  q.add(t.right);
               }
        }
        System.out.println(t.data+" temp");
        if(keyNode!=null)
        {
            String x=t.data;
            deleteDeep(root,x);  // d
            keyNode.data=x;
        }
    }
    
    public static void deleteDeep(Node root,String d)
    {
        Node temp=null;
        
        Queue <Node> q=new LinkedList<>();
                q.add(root);
        
        while(!q.isEmpty())
        {
            temp=q.remove();
            
            if(temp.data.equals(d))
            {
                temp=null;
                return;
            }
            
            if(temp.right!=null)
            {
                if(temp.right.data.equals(d))
                {
                    temp.right=null;
                    return;
                }
                 else{
                q.add(temp.right);
            }
            }
           
            
            if(temp.left!=null)
            {
                if(temp.left.data.equals(d))
                {
                    temp.left=null;
                    return;
                }
                else{
                q.add(temp.right);
            }
            }
            
        }
    }
    
    
public static void main(String[]args)
{
    Node root=null;
    
    Scanner sc=new Scanner(System.in);
    
    String str=sc.nextLine();
    
    String[]arr=str.split(" ");
    
    for(int i=0;i<arr.length;i++)
    {
        root=create(root,arr[i]);
    }
    
    delete(root,"C");
    
    System.out.println("Preorder:");
    preorder(root);
            
}
}
