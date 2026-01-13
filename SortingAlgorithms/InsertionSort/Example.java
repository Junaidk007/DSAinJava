
public class Example {
        public static void insertionSort(int[] arr) {

        System.out.println("Initial Array:");
        printArray(arr);
        System.out.println("=================================\n");

        for (int i = 1; i < arr.length; i++) {

            System.out.println("👉 Pass " + i);
            System.out.println("i = " + i);

            int key = arr[i];
            System.out.println("Picked element (key) = " + key);

            int j = i - 1;
            System.out.println("Starting j = " + j);
            System.out.println("---------------------------------");

            while (j >= 0 && arr[j] > key) {

                System.out.println(
                    "arr[" + j + "] (" + arr[j] + ") > key (" + key + ") → shift");

                arr[j + 1] = arr[j];
                printArray(arr);

                j--;
                System.out.println("j moves to → " + j);
            }

            arr[j + 1] = key;
            System.out.println("Insert key at position " + (j + 1));
            printArray(arr);

            System.out.println("=================================\n");
        }
    }

        // int[] arr = {3, 6, 1, 2, 8, 7, 4, 5, 3, 1};
        static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {5, 4, 3, 2, 1};

            printArray(arr);
            System.out.println("sorted array");
            insertionSort(arr);
        }
}
