package recursion;
import java.util.*; 
public class Print1ton {
    static void print(int n)
    {
        if(n<1)
            return ;
        print(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
