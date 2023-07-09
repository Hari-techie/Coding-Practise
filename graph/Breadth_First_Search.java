package graph;
import java.util.*;
public class Breadth_First_Search {
    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    static int n;
    static void bfs(int num)
    {
        boolean visited[] = new boolean[n];
        int s = num;
        Queue<Integer>q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty())
        {
            s = q.remove();
            System.out.print(s+" ");
            Iterator <Integer> I = a.get(s).iterator();
            while(I.hasNext())
            {
                int f = I.next();
                if(!visited[f])
                {
                    visited[f] = true;
                    q.add(f);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int i,u,v;
        for(i=0;i<n;i++)
        {
            a.add(new ArrayList <Integer>());
        }
        u = sc.nextInt();
        v = sc.nextInt();
        while(u!=-1 && v!=-1)
        {
            a.get(u).add(v);
            u = sc.nextInt();
            v = sc.nextInt();
        }
        bfs(2);
    }
}
