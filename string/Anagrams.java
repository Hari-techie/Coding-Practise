package string;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
public class Anagrams {
    public static void check(char a[],char b[])
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int l=a.length,m=b.length;
        int i;
        if(l!=m)
        {
            System.out.println("Not anagrams");
        }
        else
        {
            for(i=0;i<l;i++)
            {
                if(a[i]!=b[i])
                {
                    System.out.println("Not anagrams");
                    return;
                }
            }
            System.out.println("Anagrams");
        }
    }
    public static void check2(char a[],char b[])
    {
        int l=a.length,m=b.length;
        int i;
        HashMap<Character,Integer> h = new HashMap <> ();
        for(i=0;i<l;i++)
        {
            if(h.get(a[i])==null)
            {
                h.put(a[i], l);
            }
            else
            {
                h.put(a[i],h.get(a[i])+l);
            }
        }
        for(i=0;i<m;i++)
        {
            if(h.get(b[i])==null)
            {
                h.put(a[i], l);
            }
            else
            {
                h.put(a[i],h.get(a[i])-l);
            }
        }
        for (char c : h.keySet()) 
        {
            if(h.get(c)>0)
            {
                System.out.println("No anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a[] = sc.nextLine().toCharArray();
        char b[] = sc.nextLine().toCharArray();
        check(a,b);
        check2(a,b);
    }
}
