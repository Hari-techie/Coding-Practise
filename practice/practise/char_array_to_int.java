package practise;

public class char_array_to_int {
     public static void main(String[] args) {
        char[] arr = {'2','3','4','5'};
        int val = contains(arr);
        System.out.println("Int value after conversion : "+val);
    }
    public static int contains(final char[] arr) {
        int number = Integer.parseInt(String.valueOf(arr));
        return number; 
    } 
}
