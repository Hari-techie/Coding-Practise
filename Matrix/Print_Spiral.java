package Matrix;
import java.util.*;
public class Print_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n = sc.nextInt();
        int a[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int top=0,down=n-1,left=0,right=n-1,dir=0;
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(i=left;i<=right;i++)
                {
                    System.out.print(a[top][i]+" ");
                }
                top++;
            }
            else if(dir==1)
            {
                for(i=top;i<=down;i++)
                {
                    System.out.print(a[i][right]+" ");
                }
                right--;
            }
            else if(dir==2)
            {
                for(i=right;i>=left;i--)
                {
                    System.out.print(a[down][i]+" ");
                }
                down--;
            }
            else
            {
                for(i=down;i>=top;i--)
                {
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        System.out.println("");
    }
}
