
class Array1D {

    int arr[] = new int[5];
}

class Array2D {

    int arr[][] = new int[3][4];
}

public class Main {

   static  void createArray(int arr[], int arr1[][]) {
        if(arr != null) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 2;
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[0].length; j++) {
                    arr1[i][j] = j + 2;
                }
            }
        }
    }

    static void printArray(int arr[], int arr1[][]) {
        if(arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[0].length; j++) {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Array1D ar = new Array1D();
        Array2D ar1 = new Array2D();
        createArray(ar.arr, null);
        createArray(null, ar1.arr);
        printArray(ar.arr, null);
        System.out.println("===================================");
        printArray(null, ar1.arr);
    }
}
