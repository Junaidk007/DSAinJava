
public class Code {

    public static void insertionSort(int[] arr) {
        for (int i = 1 ; i < arr.length; i++) {
            int key = arr[i];  // current index of i
            int j = i - 1; // 1

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // 
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        printArray(arr);
        System.out.println("sorted array");
        insertionSort(arr);
        printArray(arr);
    }
}
