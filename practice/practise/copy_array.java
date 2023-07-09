package practise;
import java.util.Arrays;

public class copy_array {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 4, 6, 8, 10};

        int[] array2 = Arrays.copyOf(array1, array1.length);

        for (int i = 0; i < array2.length; i++) {
            System.out.println("array2 position " + i + ": " + array2[i]);
        }

    }
}
/*
String[] array1 = new String[]{"Adam", "Claire", "Dave", "Greg", "Halsey", "Jane", "Kylie"};
 String[] array2 = new String[array1.length];
 System.arraycopy(array1, 0, array2, 0, array1.length);

int[][] array1 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
        int[][] array2 = array1.clone();
*/