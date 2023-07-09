package arrays;
import java.util.*;
public class CuttingRopesMaxLength {
    public static int count(int a[],int n,int k)
    {
        int i,j,c,l=1,mxl=1;
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                c+=a[j]/a[i];
            }
            
            if(c>=k)
            {
                l=a[i];
            }
            if(l>mxl)
            {
                mxl=l;
            }
        }
        return mxl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        int high = 0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            high = Math.max(a[i], high);
        }
        int k = sc.nextInt();
        int low = 1,ans=1;
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int count = 0;
            for(int j=0;j<n;j++)
            {
                count+=a[j]/mid;
            }
            if(count>=k)
            {
                ans = mid;
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        System.out.println(ans);
        int c = count(a,n,k);
        System.out.println(c);
    }
}
