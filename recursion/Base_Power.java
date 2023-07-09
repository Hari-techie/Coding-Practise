package recursion;
import java.util.*; 
public class Base_Power {
    static int power(int b,int p)
    {
        if(p==1)
            return b;
        return b*power(b,p-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt(),exp=sc.nextInt();
        System.out.println(power(base,exp));
    }
}
