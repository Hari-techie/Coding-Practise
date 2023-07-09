package singlylinkedlist;

import java.util.*;
public class Palindrome 
{
    Scanner sc = new Scanner(System.in);
    static Node head=null,temp,newnode;
    static class Node
    {
        char data;
        Node next;
    }
    static void create(char d)
    {
       Node newnode = new Node();
       newnode.data = d;
       if(head==null)
       {
           head=temp=newnode;
       }
       else
       {
           temp.next = newnode;
           temp = newnode;
       }
    }
    static void display()
    {
        temp = head;
        while(temp!=null)
        {
             System.out.print(temp.data);
             temp = temp.next;
        }
        System.out.println("");
    }
    static  boolean palindrome()
    {
        Node t = head;
        boolean d = true;
        Stack <Character> St = new Stack<Character>();
        while(t!=null)
        {
            St.push(t.data);
            t=t.next;
        }
        t = head;
        while(t!=null)
        {
            char c = St.pop();
            if(c!=t.data)
            {
                d = false;
                return d;
            }
            t = t.next;
        }
        return d;
    }
            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Palindrome lst = new Palindrome();
        String s = sc.nextLine();
        int i, l = s.length();
        for(i=0;i<l;i++)
        {
            create(s.charAt(i));
        }
        display();
        if(palindrome())
        { 
            System.out.println("Palindrome");
        }
        else
        {
             System.out.println("Not a Palindrome");
        }
    }
}
