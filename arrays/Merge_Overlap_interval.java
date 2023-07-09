package arrays;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Overlap_interval {
    static public class Interval
    {
        int start,end;
        Interval(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
    }
    public static void mergeIntervals(Interval a[])
    {
        Arrays.sort(a,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1,Interval i2)
            {
                return i2.start - i1.start;
            }
        });
        int index = 0; 
        for (int i=1; i<a.length; i++)
        {
            if (a[index].end >=  a[i].start)
            {
                a[index].end = Math.max(a[index].end, a[i].end);
                a[index].start = Math.min(a[index].start, a[i].start);
            }
            else 
            {
                index++;
                a[index] = a[i];
            }   
        }
      
        for (int i = 0; i <= index; i++)
        {
            System.out.print("[" + a[i].start + ","  + a[i].end + "]");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,s,e;
        Interval a[] = new Interval[n];
        for(i=0;i<n;i++)
        {
            s = sc.nextInt();
            e = sc.nextInt();
            a[i] = new Interval(s,e);
        }
        mergeIntervals(a);
        System.out.println("");
    }
}
