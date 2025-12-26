public class Solution {
    static int DiagonalSum(int[][] arr) {
        int Psum = 0;
        int Ssum = 0;

        // UnOptimized solution
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i == j) Psum += arr[i][j];
        //         if ((i + j) == arr.length - 1) {
        //             if (i == j) continue;
        //             Ssum += arr[i][j];
        //         }
        //     }
        // }

        // Optimized Solution
        for (int i = 0; i < arr.length; i++) {
            Psum += arr[i][i];
            if (i == arr.length - 1 - i) continue;  // to avoid adding the middle element twice in case of odd sized matrix
            Ssum += arr[i][arr.length - 1 - i];  // since secondry diagonal sum = row idx + col idx = matrix size - 1
                                                // therefore, col idx = matrix size - 1 - row idx
        }

        int totalSum = Psum + Ssum;

        return totalSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4},
            {6, 7, 8},
            {1, 9, 5}
        };

        System.out.println("The sum of primary diagonal is " + DiagonalSum(arr));
    }
}