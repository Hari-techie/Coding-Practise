package arrays;
import java.util.*;
/*

Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
1. 5 if a perfect square
2. 4 if multiple of 4 and divisible by 6
3. 3 if even number

And sort the numbers based on the weight and print it as follows

<10,its_weight>,<36,its weight><89,its weight>

Should display the numbers based on increasing order.

10 36 8 49 12
<8,3>
<10,3>
<49,5>
<12,7>
<36,12>

*/
public class Sort_Based_On_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int a[] = new int[n];
        int s[] = new int[n];
        int sum=0,sq;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sq = (int)Math.sqrt(a[i]);
            if(sq*sq==a[i])
            {
                sum+=5;
            }
            if(a[i]%4==0 && a[i]%6==0)
            {
                sum+=4;
            }
            if(a[i]%2==0)
            {
                sum+=3;
            }
            s[i]=sum;
            sum=0;
        }
        int x,y;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(s[j]>=s[j+1])
                {
                    x = s[j];
                    s[j] = s[j+1];
                    s[j+1] = x;
                    y = a[j];
                    a[j] = a[j+1];
                    a[j+1] = y;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println("<"+a[i]+","+s[i]+">");
        }
    }
}
