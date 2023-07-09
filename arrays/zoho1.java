/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harir
 */
import java.util.*;
public class zoho1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l = sc.nextInt(),r = sc.nextInt(),p;
        l=l-1;
        r=r-1;
        p=(l+r)/2;
        for(i=l;i<p;i++)
        {
            int t = a[i];
            a[i] = a[r];
            a[r] = t;
            r--;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
