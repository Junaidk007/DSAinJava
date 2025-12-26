// Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix 
// a11    a12    a13
// a21    a22    a23

// Transposed Matrix
// a11    a21
// a12    a22
// a13    a23
public class Que3 {

    static int[][] transpose(int[][] arr) {
        int[][] tr = new int[arr[0].length][arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tr[j][i] = arr[i][j];
            }
        }

        return tr;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 6},
            {5, 7, 8}
        };

        int[][] transposed = transpose(arr);

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
