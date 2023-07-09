package practise;
import java.util.*;
public class High_num_formed_by_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =  {1, 34, 3, 98, 9, 76, 45, 4};
        int i,j,n=8;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                String c = String.valueOf(a[i])+ String.valueOf(a[j]);
                String d = String.valueOf(a[j])+ String.valueOf(a[i]);
                int p =Integer.parseInt(c);
                int q =Integer.parseInt(d);
                if(p<q)
                {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        String s="";
        for(i=0;i<n;i++)
        {
           s+=String.valueOf(a[i]);
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println(s);
    }
}
