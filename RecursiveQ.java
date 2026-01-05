public class RecursiveQ {
    // Print number form 1 to n
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        
        printNum(n-1);
        System.out.println(n);
    }

    // Print number from n to 1
    public static void printN(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println(n);
        printN(n-1);
    }

    // Sum of N numbers
    public static int sumOfNum(int n) {
        if (n == 1) return 1;

        return n + sumOfNum(n-1);
    }

    // Count the no.of digits in number
    public static int nOfDigits(int n) {        
        if (n < 10) return 1;

        return 1 + nOfDigits(n/10);
        // nOfD(1234) == 1 + 3
        // nOfD(123) == 1 + 2
        // nOfD(12) == 1 + 1
        // nOfD(1) == 1 
    }

    // Check array is sorted or not
    public static boolean isArrSorted(int[] arr, int i) {
        if(i == arr.length - 1 || arr.length <= 1) return true;
        
        if (arr[i] > arr[i+1]) return false;

        return isArrSorted(arr, i + 1);

        // arr {1, 2, 3, 4}
        // isArrSorted(arr, 0) if both condition is false then next call
        // isArrSorted(arr, 1) if both condition is false then next call
        // isArrSorted(arr, 2) if both condition is false then next call
        // isArrSorted(arr, 3) now fun is on last elemnet so it will return true 
    }

    // Find the largest element
    public static int isLargeAr(int[] arr, int idx) {
        if (idx == arr.length -1 ) return arr[idx];

        int largest = isLargeAr(arr,  idx + 1);

        if (largest < arr[idx]) {
            return arr[idx];
        } else {
            return largest;
        }
    }

    // Reverse a string
    public static String revString(String s) {
        if (s.length() <= 1) return s;
        return revString(s.substring(1)) + s.charAt(0);

        // revString(abcd) == dcb + a
        // revString(bcd) == dc + b
        // revString(cd) == d + c
        // revString(d) == '' + d
        // revString() == ""
    }

    // Palindrome Check
    public static boolean checkPalindrom(String s) {
        if (s.length() <= 1) return true;

        if (s.charAt(0) != s.charAt(s.length()-1)) return false;

        return checkPalindrom(s.substring(1,s.length() - 1));
    }
    
    public static void main(String[] args) {
        // printNum(5);
        // printN(4);
        // System.out.println(sumOfNum(4));
        // System.out.println(nOfDigits(0));
        int[] arr = {1, 2, 4, 8, 3};
        // System.out.println(isArrSorted(arr, 0));
        // System.out.println(isLargeAr(arr, 0));
        // System.out.println(revString("abcd"));
        System.out.println(checkPalindrom("noon"));
    }
}
