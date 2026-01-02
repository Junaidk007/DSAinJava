public class IsSortedArr {
    public static boolean isSortedArr(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSortedArr(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 5};
        int i = 0;

        System.out.println(isSortedArr(arr, i)? "array is sorted" : "array is not sorted");
    }
}
