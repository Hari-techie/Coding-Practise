package practise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;                                                                                             //846903
public class Practise {                                                                                         //034689
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        int a=sc.nextInt();
        String[] b= Integer.toString(a).split("");
        int l=b.length;
        int[] c=new int[l];
        int i,j;
 
for(i=0;i<l;i++)
        {
            c[i]=Integer.parseInt(b[i]);
        }
        int[] d=new int[l];
        int temp;
        Arrays.sort(c);
        for(i=0;i<l;i++)
        {
            if(c[0]==0){
                 for(j=i+1;j<l;j++){
                     if(c[j]!=0){
                         temp=c[0];
                         c[0]=c[j];
                         c[j]=temp;
                         break;
                     }
            }
           
            }
        }
        
for(i=0;i<l;i++){
        System.out.print(c[i]+"");
        }
    }
}