package SortingAlgorithms.BubbleSort;

public class Code {
    public static int[] bubbleSort(int[] arr) {
        int temp;
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
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
        printArray(bubbleSort(arr));
    }
}
