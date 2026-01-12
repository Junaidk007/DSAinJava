
public class Code {

    public static void mergeSort(int[] arr, int si, int ei) {
       if (si >= ei) return;

        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, ei, mid);
    }

    public static void merge(int[] arr, int si, int ei, int mid) {
        int[] temp = new int[ei-si+1];

        int L = si;
        int R = mid+1;
        int T = 0;

        while (L <= mid && R <= ei) {
            if (arr[L] < arr[R]) {
                temp[T] = arr[L];
                L++;
            } else {
                temp[T] = arr[R];
                R++;
            }
            T++;
        }

        while (L <= mid) {
            temp[T++] = arr[L++];
        }

        while (R <= ei) {
            temp[T++] = arr[R++];
        }

        for(T = 0, L = si; T < temp.length; T++, L++) {
            arr[L] = temp[T];
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 2, 1};

        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        printArray(arr);

    }
}
