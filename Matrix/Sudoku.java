package Matrix;
import java.util.*;
/*
 
input:
          3 1 6 5 7 8 4 9 2
          5 2 9 1 3 4 7 6 8
          4 8 7 6 2 9 5 3 1
          2 6 3 4 1 5 9 8 7
          9 7 4 8 6 3 1 2 5
          8 5 1 7 9 2 6 4 3
          1 3 8 9 4 7 2 5 6
          6 9 2 3 5 1 8 7 4
          7 4 5 2 8 6 3 1 9
output : true

*/
public class Sudoku {
    public static void main(String[] args) {
        int a[][] = {
                {3, 1, 6, 5, 7, 8, 4, 9, 2},
                {5, 2, 9, 1, 3, 4, 7, 6, 8},
                {4, 8, 7, 6, 2, 9, 5, 3, 1},
                {2, 6, 3, 4, 1, 5, 9, 8, 7},
                {9,7, 4, 8, 6, 3, 1, 2, 5},
                {8, 5,1, 7, 9, 2, 6, 4, 3},
                {1, 3, 8, 9, 4, 7, 2, 5, 6},
                {6, 9, 2, 3 ,5 ,1 ,8 ,7, 4},
                {7, 4, 5 ,2 ,8 ,6 ,3 ,1, 9}
                     };
        HashSet<String> h = new HashSet<>();
        int i,j,c;
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                c = a[i][j];
                if(!(h.add(c+" added in row "+i))|| !(h.add(c+" added in column "+j)) || !(h.add(c+" added in box "+i/3+" - "+j/3)))
                {
                    System.out.println("Not valid");
                    return;
                }
            }
        }
        System.out.println("Valid");
    }
}
