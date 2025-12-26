package practice;

public class Main {

    static int countElement(int ar[][], int n) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == n) {
                    count += 1;
                }
            }
        }
        return count;
    }

    static int arSum(int ar[][]) {
        int sum = 0;
        for (int i = 0; i < ar[0].length; i++) {
            sum += ar[1][i];
        }
        return sum;
    }

    static int[][] transpose(int ar[][]) {
        int row = ar[0].length;
        int col = ar.length;
        int arr[][] = new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = ar[j][i];
            }
        }
        return arr;
    }

    static void display(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{4, 7, 8}, {11, 4, 3}, {8, 8, 7}};

        int result[][] = transpose(arr);
        display(arr);
        System.out.println("Transpose:\n");
        display(result);

    }
}
