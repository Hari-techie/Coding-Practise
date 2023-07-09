package Matrix;
import java.util.*;
public class NoOfIslands {
    static int ROW =5,COL=5;
    public static int countIsland(int a[][])
    {
        boolean v[][] = new boolean[ROW][COL];
        int c=0,i,j;
        for(i=0;i<ROW;i++)
        {
            for(j=0;j<COL;j++)
            {
                if(a[i][j]==1 && !v[i][j])
                {
                    dfs(a,i,j,v);
                    c++;
                }
            }
        }
        return c;
    }
    
    public static void dfs(int a[][],int x,int y,boolean v[][])
    {
        v[x][y]=true;
        if(issafe(a,x-1,y-1,v))
        {
            dfs(a,x-1,y-1,v);
        }
        if(issafe(a,x-1,y,v))
        {
            dfs(a,x-1,y,v);
        }
        if(issafe(a,x-1,y+1,v))
        {
            dfs(a,x-1,y+1,v);
        }
        if(issafe(a,x,y-1,v))
        {
            dfs(a,x,y-1,v);
        }
        if(issafe(a,x,y+1,v))
        {
            dfs(a,x,y+1,v);
        }
        if(issafe(a,x+1,y-1,v))
        {
            dfs(a,x+1,y-1,v);
        }
        if(issafe(a,x+1,y,v))
        {
            dfs(a,x+1,y,v);
        }
        if(issafe(a,x+1,y+1,v))
        {
            dfs(a,x+1,y+1,v);
        }
    }
    public static boolean issafe(int a[][],int x,int y,boolean[][] v)
    {
        return x>=0 && x<ROW
                && y>=0 && y<COL 
                && a[x][y]==1
                && !v[x][y];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = {
            {0,1,0,0,1},
            {1,1,0,0,0},
            {1,0,0,1,1},
            {0,0,0,0,0},
            {1,0,0,0,1}};
         System.out.println(countIsland(a));       
    }
}
