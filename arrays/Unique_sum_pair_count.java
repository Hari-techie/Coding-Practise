package arrays;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Unique_sum_pair_count
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		ArrayList<Integer>  al = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
	//	ArrayList <Integer> al =  new ArrayList  (Arrays.asList(a));
		int c=0;
		for(i=0;i<n;i++)
		{
		    if(al.contains(k-(al.get(i))))
		    {
		        c++;
		    }
		}
		System.out.println(c/2);
	}
}

/*

import com.google.common.primitives.Ints;
import java.util.List;

public class IntToInteger {
    public static void main(String[] args) {

        int[] intArray = {13, 17, 21, 23};

        List<Integer> integerArray = Ints.asList(intArray);

        System.out.println(integerArray);
    }
}

*/