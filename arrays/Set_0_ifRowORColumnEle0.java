package arrays;
import java.util.*;
public class Set_0_ifRowORColumnEle0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,r=sc.nextInt(),c=sc.nextInt();
        int a[][] = new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int col=1;
        for(i=0;i<r;i++)
        {
            if(a[i][0]==0) col=0;
            for(j=1;j<c;j++)
            {
                if(a[i][j]==0)
                    a[i][0]=a[0][j]=0;
            }
        }
        for(i=r-1;i>=0;i--)
        {
            for(j=c-1;j>=1;j--)
            {
                if(a[i][0]==0 || a[0][j]==0)
                {
                    a[i][j]=0;
                }
            }
            if(col==0)
            {
                a[i][0]=0;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
