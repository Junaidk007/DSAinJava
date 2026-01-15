package SortingAlgorithms.QuickSort;

import java.util.Arrays;

public class Example {

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        System.out.println("\nCalling quickSort from index " + si + " to " + ei);
        System.out.println("Current Array: " + Arrays.toString(arr));

        int pIdx = partition(arr, si, ei);

        System.out.println("Pivot placed at index " + pIdx);
        System.out.println("Array after partition: " + Arrays.toString(arr));

        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei]; // pivot element
        int i = si - 1;

        System.out.println("\nPartitioning with pivot: " + pivot);

        for (int j = si; j < ei; j++) {
            System.out.println("value of i: " + i + ", value of j: " + j + ", Current Array: " + Arrays.toString(arr));
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                System.out.println("Swapped → " + Arrays.toString(arr));
            }
        }

        // place pivot at correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        System.out.println("Pivot swapped → " + Arrays.toString(arr));

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nFinal Sorted Array: " + Arrays.toString(arr));
    }
}
