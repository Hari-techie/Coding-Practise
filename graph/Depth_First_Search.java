package graph;
import java.util.*;
 import java.util.*;
public class Depth_First_Search {
    static int n;
   static ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
   static void DFS(int num,boolean[] visited)
   {
           int s=num;//2
           visited[s]=true;
           System.out.print(s+" ");                                                
           Iterator<Integer> i=a.get(s).iterator();
           while(i.hasNext())
           {
               int f=i.next();
               if(!visited[f])
               {
                   DFS(f,visited);
               }
           }
   }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of nodes:");
        
         n=sc.nextInt();
        
          boolean[] visited=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        
        System.out.println("u and v:");
        int u=sc.nextInt();
        int v=sc.nextInt();
        
        while(u!=-1 && v!=-1)
        {
            a.get(u).add(v);
            
            u=sc.nextInt();
            v=sc.nextInt();
        }
        
        DFS(2,visited);
    }
}