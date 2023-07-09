package graph;
import java.util.*;
public class Dijkstras_Algorithm {
    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    static int n;
    static int shortest_dis(boolean visited[],int distance[])
    {
        int mn = Integer.MAX_VALUE,ind=-1,i;
        for(i=0;i<n;i++)
        {
            if(!visited[i] && distance[i]<=mn)
            {
                mn = distance[i];
                ind = i;
            }
        }
        return ind;
    }
    static void Dijk(int start)
    {
        int short_distance[] = new int[n];
        boolean visited[] = new boolean[n];
        int i,j,mn;
        for(i=0;i<n;i++)
        {
            short_distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        short_distance[start]=0;
        for(i=0;i<n-1;i++)
        {
            mn = shortest_dis(visited,short_distance);
            visited[mn] = true;
            for(j=0;j<n;j++)
            {
                if(!visited[j] && short_distance[i]!= Integer.MAX_VALUE && a.get(i).get(j)!=0 && a.get(i).get(j)+short_distance[i]<= short_distance[j])
                {
                    short_distance[j] = short_distance[i] + a.get(i).get(j);
                }
            }
        }
        print_distance(short_distance);
    }
    static void print_distance(int distance[])
    {
        System.out.println("Vertex    Distance");
        for(int i=0;i<n;i++)
        {
            System.out.println(i+"     "+distance[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a.get(i).add(sc.nextInt());
            }
        }
        Dijk(0);
    }
}
