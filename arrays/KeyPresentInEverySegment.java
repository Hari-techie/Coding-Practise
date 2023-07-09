package arrays;
import java.util.*;
public class KeyPresentInEverySegment {
    public static void main(String[] args) {
        int arr[] =  { 5, 8, 7, 12, 14, 3, 9}  ;
        int i,j,x = 8,k = 2,n = arr.length;
        boolean f;
        for(i=0;i<n;i=i+k)
        {
            f = false;
            for(j=i;j<i+k;j++)
            {
                if(arr[j]==x)
                {
                    f = true;
                }
                if(j==n-1)
                {
                    break;
                }
            }
            if(f==false)
            {
                System.out.println("No");
                return;
            } 
        }
        System.out.println("Yes");
    }
}
