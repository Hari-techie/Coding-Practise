import java.util.*;                                  
public class Nextgreatestnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j,temp;
        String[] b= Integer.toString(a).split("");
        int l=b.length;
        int[] c=new int[l];
       
        for(i=0;i<l;i++)
        {
            c[i]=Integer.parseInt(b[i]);
        }
        j=l-1;
        int t1=0;
        for(i=j;i>=0;i--)
        {
            if(c[j]>c[i])
            {
                temp=c[j];
                c[j]=c[i];
                c[i]=temp;
                t1=i;
                break;
            }
        }
        for(i=0;i<=t1;i++)
         {
        System.out.print(c[i]+"");
        }
        int[] d=new int[l-t1];
        int n=0;
        for(i=t1+1;i<l;i++)
         {
             d[n]=c[i];
             n++;
        }
        Arrays.sort(d);
         for(i=1;i<l-t1;i++)
         {
        System.out.print(d[i]+"");
        }
    }
}