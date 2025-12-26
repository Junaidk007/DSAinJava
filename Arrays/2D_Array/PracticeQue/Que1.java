// Question 1 :Print the number of 7’s that are inthe 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2

public class Que1 {
    static int count(int[][] arr, int key) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] array = { 
            {4,7,8},
            {8,8,7} };

        System.out.println(count(array, 8));
    }
}
