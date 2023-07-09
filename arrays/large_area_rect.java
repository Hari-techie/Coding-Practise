package arrays;
/*import java.util.*;

public class large_area_rect
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	    int i,j,k=0,sum=0,mx=0,n = 6;
	    int a[] = {5,4,7,5,6,3};
	    //int a[] = {2,5,4,9,7,3,6};
	    int b[] = new int[n];
	    int s[] = new int[50]; // b = a.clone();  
	    for(i=0;i<n;i++)
	    {
	        b[i] = a[i];
	    }
	    Arrays.sort(b);
	    for(i=0;i<n;i++)      // a = 5 4 7 5 6 3
	    {
	        sum=0;
	        for(j=0;j<n;j++)  // b = 3 4 5 5 6 7
	        {
	            if(a[j]>=b[i])
	            {
	                sum+=b[i];
	                s[k]=sum;
	                k++;
	            }
	            else
	            {
	               // s[k]=sum;
	               //k++;
	                sum=0;
	            }
	           //  System.out.print(sum+" ");
	        }
	    }
	    for(i=0;i<s.length;i++)
	    {
	        if(s[i]>mx)
	        {
	            mx=s[i];
	        }
	    } 
		System.out.println("max : "+mx);
    }
     
}/*

*/ 
import java.util.*;
public class large_area_rect
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++){
	     a[i]=sc.nextInt();
	 }
	 int max_Area=0,area=0,min=Integer.MAX_VALUE;
	 for(int i=0;i<n;i++){
	     area=a[i];min=a[i];
	     for(int j=i+1;j<n;j++){
	         if(a[j]<min){
	             min=a[j];
	             area=min*(j-i+1);
	         }
	         else{
	         area=area+min;}
	         if(area>max_Area){
	             max_Area=area;
	         }
	     }
	 }
	 System.out.println(max_Area);
	}
}
