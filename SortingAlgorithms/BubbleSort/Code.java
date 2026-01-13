package SortingAlgorithms.BubbleSort;

public class Code {
    public static int[] bubbleSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - 1; j++) {
                if (arr[j] > arr[j+1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
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

//  int[] arr = {6, 5, 4, 3, 2, 1};

// i = 0

// {6, 5, 4, 3, 2} j = 0
 
// j++

// {5, 6, 4, 3, 2} j = 1

// j++

// {5, 4, 6, 3, 2} j = 2

// j++

// {5, 4, 3, 6, 2} j = 3

// j++

// {5, 4, 3, 2, 6} j = 4

// i = 1

// {5, 4, 3, 2, 6} j = 0