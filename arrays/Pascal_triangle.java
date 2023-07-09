package arrays;
import java.util.*;
public class Pascal_triangle {
    public static int fact(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of element to print : ");
        int r = sc.nextInt(), c = sc.nextInt();
        int res = fact(r-1)/fact(c-1);
        System.out.println(res);
    }
    public static void print_row()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of element to print : ");
        int i=0,r = sc.nextInt();
        int res=1;
        for(i=1;i<=r;i++)
        {
            System.out.print(res+" ");
            res = res * (r - i) / i;
        }
        System.out.println("");
    }
    public static void print_pascal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows to print : ");
        int i,j,n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int c=1;
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c = c * (i-j) / j;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print();
        //print_row();
        print_pascal();
    }
}
