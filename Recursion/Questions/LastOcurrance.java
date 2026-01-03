
// The goal is to find the last index of a specific element (called the target) in an array.
// Example:  // Array: [2, 5, 6, 5, 3], Target: 5
// Last occurrence index: 3 (since 5 appears at index 1 and 3, and 3 is the last).

public class LastOcurrance {
    public static int lastOcurrance1(int[] ar, int key, int i) {
        if (i == -1) return i;
        if (ar[i] == key) return i;

        return lastOcurrance1(ar, key, i - 1);

        // worst case time complexity = O(n)
        // space complexity = O(n)
    }

    public static int lastOcurrance2(int[] ar, int key, int i) {
        if (i == ar.length) return -1;

        int lastIdx = lastOcurrance2(ar, key, i + 1);

        if (lastIdx == -1 && ar[i] == key) return i;

        return lastIdx;
       
        // time complexity = O(n), for all cases.
        // space complexity = O(n)
    }

    public static void main(String[] args) {
        int[] ar = {2, 4, 5, 3, 4, 9};

        System.out.println(lastOcurrance1(ar, 4, ar.length - 1));
        System.out.println("--------------------");
        System.out.println(lastOcurrance2(ar, 4, 0));
    }
}
