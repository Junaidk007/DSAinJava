// Print array elements using recursion.


public class PrintArr {
    public static void printArr(int[] ar, int i) {
        if (i == ar.length) {
            return;
        }

        System.out.print(ar[i] + ", ");

        printArr(ar, i + 1);
    }

    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 6 ,7, 6};

        printArr(ar, 0);
    }
}

