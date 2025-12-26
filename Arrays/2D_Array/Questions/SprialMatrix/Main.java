// package Arrays.2D_Array.Questions.SprialMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {5, 6, 7},
            {9, 10, 11}
        };
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int h = startCol; h <= endCol; h++) {
                System.out.print(matrix[startRow][h] + " ");
            }
            // Right column
            for ( int i = startRow+1; i <= endRow; i++ ) {

                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom row
            for (int j = endCol-1; j >= startCol; j--){
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left column
            for (int k = endRow-1; k >= startRow+1; k--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[k][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++; 
            endCol--;   
        }
    }
}
