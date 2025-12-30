// Given a number N, find the sum of its digits using recursion.

public class NSum {
    static int nSum(int n) {
        if (n == 1) {
            return n;
        }
        return n + nSum( n - 1);
    }

    public static void main(String[] args) {
        System.out.println(nSum(3));
    }
}

// nSum(3) = return 3 + nSum(2)
// nSum(2) = return 2 + nSum(1) 
// nSum(1) = return 1

