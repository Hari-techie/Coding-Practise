package Matrix;
import java.util.*;
public class Print_Unique_Rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(),i,j,k,flag=0;
        int a[][] = new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            flag=0;
            for(j=0;j<i;j++)
            {
                flag=1;
                for(k=0;k<c;k++)
                if(a[i][k]!=a[j][k])
                    flag=0;
                if(flag==1)
                    break;
            }
            if(flag==0)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
