package arrays.pattern;
import java.util.*;
public class p11X_O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter columns: ");
        int c = sc.nextInt();
        int top=0,down=r-1,left=0,right=c-1;
        char x;
        char a[][] = new char[r][c];
        while(true)
        {
            if(top%2==0)
               x='X';
            else
                x='O';
            for(int i=left;i<=right;++i) 
                a[top][i] = x;
            top++;
     
            if(top>down || left>right) 
                break;
            //print last column
            for(int i=top;i<=down;++i) 
                a[i][right] = x;
            right--;
     
            if(top>down || left>right)
                break;
            //print last row
            for(int i=right;i>=left;--i)
                a[down][i] = x;
            down--;
     
            if(top>down || left>right)
                break;
            //print first column
            for(int i=down;i>=top;--i) 
                a[i][left] = x;
            left++;
            
            if(top>down || left>right) 
                break;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
