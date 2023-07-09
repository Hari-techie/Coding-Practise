package graph;
import java.util.*;
public class Detection_Of_Cycle_In_Undirected_Graph {
    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    static int n;
    static boolean isCycleUtil(int cur,boolean[] visited,int parent)
    {
       visited[cur] = true;
       Iterator<Integer> i = a.get(cur).iterator();
       while(i.hasNext())
       {
          int val = i.next();
          if(!visited[val])
          {
              if(isCycleUtil(val,visited,cur))
              {
                  return true;
              }
          }
          else if(val!=parent)
          {
              return true;
          }
       }
       return false;
    }
    static boolean isCycle(boolean visited[])
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(!visited[i])
            {
            if(isCycleUtil(i,visited,-1))
            {
                return true;
            }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        int u = sc.nextInt();
        int v = sc.nextInt();
        while(u!=-1 && v!=-1)
        {
            a.get(u).add(v);
            a.get(v).add(u);
            u = sc.nextInt();
            v = sc.nextInt();
        }
        boolean visited[] = new boolean[n];
        for(i=0;i<n;i++)
        {
            visited[i]=false;
        }
        if(isCycle(visited))
        {
            System.out.println("Cycle found");
        }
        else
        {
            System.out.println("Cycle not found");
        }
    }
}
