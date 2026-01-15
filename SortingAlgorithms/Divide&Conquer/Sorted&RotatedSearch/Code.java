

public class Code {
    public static int search(int[] arr, int target, int si, int ei) {
        if (si > ei) return -1;
        // for line 1
        int mid = si + (ei - si ) / 2;

        if (arr[mid] == target) return mid;

        if (arr[si] <= arr[mid]) {

            if (arr[si] <= target && arr[mid] > target) return search(arr, target, si, mid - 1);

            else return search(arr, target, mid + 1, ei);
        } else {

            if (arr[mid] < target && target <= arr[ei]) return search(arr, target, mid + 1, ei); 

            else  return search(arr, target, si, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        System.out.println(search(arr, 3, 0, arr.length-1));
    }
}
