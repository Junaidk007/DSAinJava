public class Creation {
    public static void main(String[] args) {
        // Creating a 2D array with 3 rows and 4 columns
        int[][] array = new int[3][4];

        // Initializing the 2D array
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;                    

        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;

        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;

        // Printing the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}