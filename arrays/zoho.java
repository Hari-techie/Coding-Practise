package arrays;
import java.util.*;
public class zoho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt(),m=sc.nextInt(),degree,hp,mp;
        hp = h*360/12+(m*360)/(12*60);
        mp = m*360/60;
        degree = Math.abs(hp-mp);
        if(degree>180)
        {
            degree = 360-degree;
        }
        System.out.println(degree+" degree");
    }
}
