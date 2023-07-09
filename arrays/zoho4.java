package arrays;
import java.util.*;
public class zoho4 {
    static int days[] = {31,28,31,30,31,30,31,31,30,31,31,31}; 
    static int Day_Calculation(int d,int m,int y)
    {
        int i,total=0;
        for(i=0;i<m-1;i++)
        {
           total += days[i];
        }
        total += d;
        if(m>=3 && y%4==0 )
        {
            total+=1;
        }
        //System.out.println(total);
        return total;
    }
    static int Leap_count(int y1,int y2)
    {
        int lc=0;
        for(int i=y1+1;i<y2;i++)
        {
            if(i%4==0)
            {
                lc++;
            }
        }
        return lc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dt1[] = new int[3];
        int dt2[] = new int[3];
        for(int i=0;i<3;i++)
        {
            dt1[i] = sc.nextInt();
        }
         for(int i=0;i<3;i++)
        {
            dt2[i] = sc.nextInt();
        }
        int d1=dt1[0],m1=dt1[1],y1=dt1[2];
        int d2=dt2[0],m2=dt2[1],y2=dt2[2];
        int dy = y2-y1;
        int day1 = Day_Calculation(d1,m1,y1);
        int day2 = Day_Calculation(d2,m2,y2);
        System.out.println(day1+" "+day2);
        int dif_days = day2 - day1;
        if(dy==0)
        {
            System.out.println(dif_days);
        }
        if(dy==1)
        {
            System.out.println(dif_days+(dy*365));
        }
        if(dy>1)
        {
            int lc = Leap_count(y1,y2);
            System.out.println(dif_days+(dy*365)+lc);
        }
    }
}
