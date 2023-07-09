package Matrix;
import java.util.*;
/*
   Input: mat[4][4] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},       // here 15[1 0] is less than 40[0 3]
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};        
              x = 29
Output: Found at (2, 1)
Explanation: Element at (2,1) is 29

Input : mat[4][4] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
              x = 100
Output : Element not found
Explanation: Element 100 is not found
*/
public class SearchElementInRowColSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int a[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        i=0;
        j=n-1;
        while(i<n && j>=0)
        {
            if(a[i][j]==k)
            {
                System.out.println("The position is ("+i+","+j+")");
                return;
            }
            if(a[i][j]>k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println("Not found");
    }
}
