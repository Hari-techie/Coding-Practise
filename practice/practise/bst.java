package practise;
import java.util.*;
public class bst {//Output true: if the input after root is constatnly decreasing and increasing and decreasing... then its true. eg: 15(root) 7 5 12 20 17 22
    static class Node{                                         //OUTPUT false: if the input after root is increasing and decreased... then it's false; eg: 15(root)7 8 9 5 20 25 22;
        int data;
        Node left,right;
        Node(int d)                                //try this input if didn't understand and draw it by ur hand as well : 10 7 5 4 6 8 9 14 12 11 13 17 15 18
        {
            this.data=d;
            left=right=null;
        }
}
    public static boolean IsIt(int arr[],int n)
    {
        Stack<Integer> stack=new Stack<>();
        
        int root=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < root)
            {
                return false;
            }
            
            while(!stack.empty() && stack.peek() < arr[i])
            {
                root=stack.peek();
                stack.pop();
            }
            //System.out.print(arr[i]+" ");
            stack.push(arr[i]);
        }
        return true;
    }
    
    public static void main(String[]args)
    {
        Node root=null;
        
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        
        int[]ar=new int[n];
        
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        
        if(IsIt(ar,n)==true)
        {
            System.out.println("Yes!");
        }
        else{
            System.out.println("NO!");
        }
    }
    
}