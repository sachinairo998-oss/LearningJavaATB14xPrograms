package ex_14_Arrays;

public class Lab118_2D {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        // 3x3 3 rows 3 columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
             //   System.out.print(matrix[i][j]); // 123 456 789
                System.out.print('*'); // *** *** ***
            }
            System.out.println();
        }
    }
}
