package practise;
/*
20
(1,20),(2,10),(4,5),(5,4),(10,2),(20,1)
*/
import java.util.*;
public class print_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i;
        ArrayList<Integer> a = new ArrayList<>();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                a.add(i);
            }
        }
        int s = a.size(),j=s-1;
        for(i=0;i<s;i++,j--)
        {
        System.out.print("("+a.get(i)+","+a.get(j)+")");
        if(i!=s-1)System.out.print(", ");
        }
    }
}