package SortingAlgorithms.QuickSort;

public class Code {
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) return;

        int pIdx = partision(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partision(int[] arr, int si, int ei) {
        int pivot = arr[ei]; // selecting the pivot point.
        int i = si - 1; // to make the place for elements smaller then pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }    
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 9, 3};

        System.out.println("Unsorted array: ");
        printArray(arr);
        System.out.println("----------------------");
        System.out.println("Sorted array");
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
