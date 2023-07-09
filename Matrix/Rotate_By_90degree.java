package Matrix;
import java.util.*;
public class Rotate_By_90degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i] = temp;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n/2;j++)
            {
                temp = a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1] = temp;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
