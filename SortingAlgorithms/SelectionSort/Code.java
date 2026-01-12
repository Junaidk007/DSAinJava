package SortingAlgorithms.SelectionSort;

public class Code {
    public static int[] selectionSort(int[] arr) {
        int minElement; 
        int temp;

        for (int i = 0; i < arr.length; i++) {
            minElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElement]) {
                    minElement = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;
        }

        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};

        System.out.println("Unsorted array:");
        printArray(arr);
        System.out.println("Sorted array:");
        printArray(selectionSort(arr));
    }
}
