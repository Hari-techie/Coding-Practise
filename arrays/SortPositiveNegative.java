package arrays;

public class SortPositiveNegative {
    public static void main(String[] args) {
        int a[] ={ -12,0, 11,5,8,-2, -13,0, -5, 6, -7, 5, -3, -6 };
        int start=0,mid=0,end = a.length-1;
        while(mid<=end)
        {
            if(a[mid]<0)
            {
                int t = a[start];
                a[start] = a[mid];
                a[mid] = a[start];
                mid++;
                start++;
            }
            if(a[mid]==0)
            {
                mid++;
            }
            if(a[mid]>0)
            {
                int t = a[end];
                a[end] = a[mid];
                a[mid] = t;
                end--;
            }
        }
        int t = a[start];
        a[start] = a[mid];
        a[mid] = a[start];
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
