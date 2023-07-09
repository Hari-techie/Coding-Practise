package arrays.pattern;

import java.util.*;
public class p4 {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N1=sc.nextInt(),N2=sc.nextInt();
	    int diff=Math.abs(N1-N2);
	    for(int ctr=0;ctr<diff;ctr++){
	        System.out.print((Math.max(N1,N2)-ctr) + " " + (Math.min(N1,N2)-ctr) +" ");
	    }
	}
}

/*
i/p : 17 11
      17 11 16 10 15 9 14 8 13 7 12 6
*/