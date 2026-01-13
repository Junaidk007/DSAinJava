public class Example {
    static void selectionSort(int[] arr) {
        int minElement;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " +i);
            minElement = i;
            System.out.println("minElement = " + arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("j = "+j);
                if (arr[j] < arr[minElement]) {
                    System.out.println(arr[j] + " is a min");
                    minElement = j;
                    System.out.println("value of minElement is updated to " + arr[j]);
                }
            }

            temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;


            System.out.println(arr[minElement] +" is swaped with "+ arr[i] );
            System.out.println("------------------");
            printArray(arr);

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
        selectionSort(arr);
       
    }
}
