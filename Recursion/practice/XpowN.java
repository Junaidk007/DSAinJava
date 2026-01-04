
// Find X to the power n

public class XpowN {
    public static int exponent1(int x, int n) {
        if (n == 0) return 1;

        return x * exponent1(x, n - 1);

        // time complexity = O(n)
        // space complexity = O(n)
    }

    public static int exponent2(int x, int n) {
        if (n == 0) return 1;

        int half = exponent2(x, n/2);
        System.out.println(half);

        if (n%2 == 0) { 
            return half * half; 
        } else {
            return x * half * half;
        }  

        // time complexity = O(log n)
        // space complexity = O(log n)
        
        
        // Important formula for this problem
        // for n = even;   X^n = (X^n/2)^2
        // for n = odd;    X^n = X * (X^n/2)^2
    }

    public static void main(String[] args) {
        // System.out.println(exponent1(2, 4));
        // System.out.println("------------------");
        System.out.println(exponent2(2, 4));
        // exponent1(2, 4);
    }
}
