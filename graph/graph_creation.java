package graph;
import java.util.*;
import java.util.ArrayList;
public class graph_creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,u,v;
        ArrayList <ArrayList<Integer>> a = new  ArrayList <ArrayList<Integer>>();
        for(i=0;i<n;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        u = sc.nextInt();
        v = sc.nextInt();
        while(u!=-1 && v!=-1)
        {
           
             a.get(u).add(v);
             a.get(v).add(u);
             u = sc.nextInt();
             v = sc.nextInt();
        }
        while(u!=-1 && v!=-1);
        System.out.println(a);
    }
}
