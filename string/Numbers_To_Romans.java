package string;
import java.util.*;
public class Numbers_To_Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String c[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
        String m[] = {"","M","MM","MMM"};
        if(n<11)
        {
            System.out.println(ones[n]);
        }
        else 
        {
            String thousands = m[n/1000];
            String hundereds = c[(n%1000)/100];
            String ten = tens[(n%100)/10];
            String one = ones[n%10];  
            String ans = thousands + hundereds + ten + one;
            System.out.println(ans);
        }
    }
}
