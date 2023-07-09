package string;
import java.util.*;
public class Sort_names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = sc.nextLine().split(" ");
        String temp;
        int i,j,l = names.length;
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(names[i].compareTo(names[j])>0)   // Arrays.sort(names);
                {
                   temp = names[i];
                   names[i] = names[j];
                   names[j] = temp;
                }
            }
        }
        for(i=0;i<l;i++)
        {
            System.out.println(names[i]+" ");
        }
    }
}
