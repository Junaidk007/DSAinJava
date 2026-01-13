

public class Example {
    static void bubbleSort(int[] arr) {
        int temp; 

        for (int i = 0; i < arr.length; i++) { // outer loop 
            System.out.println("i = " + i);
            System.out.println("-----------------");
            for (int j = 0; j < arr.length - 1 - i; j++) { // inner loop
                System.out.println("j = " + j);
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(arr[j + 1] + " and "+ arr[j]+ " is swapped");
                    printArray(arr);
                }
                System.out.println();
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println("Unsorted array:");
        printArray(arr);
        System.out.println("Sorted array:");
        bubbleSort(arr);
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
// .
// .
// .
// {4, 3, 2, 5, 6} j= 3

// i = 2

// {3, 2, 4, 5, 6} j = 2

// 5 - 1 = 4
//  4 - 2 = 2