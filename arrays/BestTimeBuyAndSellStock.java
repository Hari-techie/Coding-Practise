package arrays;
import java.util.*;
public class BestTimeBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int i,n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int mp=0,profit = 0,s=0,e=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
                s=i;
            }
            else if(a[i]-min>profit)
            {
                profit =  a[i]-min;
                e=i;
            }
        }
       // System.out.println("Maximum profit in 1 transaction "+profit);
      //  System.out.println("Buy the stock at "+(s+1)+"th day and sell the stock at "+(e+1)+"th day\nYou get profit of "+profit);
        int p=0;
        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            {
                p = p + (a[i]-a[i-1]);
            }
        }
        System.out.println("The profit is "+p);  // mutiple buy ; buy a stock before sell ; can't buy and sell in one day
    }
}
