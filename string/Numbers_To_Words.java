package string;
import java.util.*;
public class Numbers_To_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ones[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String teen[] = {"Twenty","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        if(n>0 && n<11)
        {
            System.out.println(ones[n]);
        }
        else if(n>10 && n<21)
        {
            System.out.println(teen[n%10]);
        }
        else
        {
            int t = n;
            int c = 0;
            while(t!=0)
            {
                c++;
                t/=10;
            }
            if(c==2)
            {
                System.out.print(tens[n/10]);
                System.out.println(ones[n%10]);
            }
            if(c==3)
            {
                System.out.print(ones[n/100]+" Hundred and ");
                //n = n - (n/100)*100;
                System.out.print(tens[(n%100)/10]+" ");
                System.out.println(ones[n%10]);
            }
        }
    }
}
