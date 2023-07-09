package arrays;
import java.util.*;
public class zoho7 {
    static boolean valid(int a[][],int i,int j,int r,int c)
    {
        if(a[i][j]!=1)
        {
            return false;
        }
        for(int k=0;k<r;k++)
        {
            if(k!=i && a[k][j]!=0)
            {
                return false;
            }
            if(k!=j && a[i][k]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int a[][] = new int[r][c];
        int i,j,count=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(valid(a,i,j,r,c))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
