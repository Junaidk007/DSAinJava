
// The First Occurrence Problem is a common programming challenge where you need to 
// find the first time a specific value appears in a list or array. 

public class FirstOcurrance {
    public static int firstOcurrance(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        } else if (arr[i] == key) {
            return i;
        }

        return firstOcurrance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 7, 9, 6};

        System.out.println(firstOcurrance(arr, 6, 0));
    }
}

// Time Complexity = 𝑂(n)
// In the worst case, the key is: at the last index, or not present at all
// So recursion checks every element once.

// --------------------------------//

// Space Complexity=O(n)
// Each recursive call is stored in the call stack
// Maximum depth of recursion = n (array size)