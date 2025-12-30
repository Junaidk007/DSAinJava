public class Main {
    static void printN(int n) {
        if (n == 0) {
            System.out.println("base case reached");
            return;
        } 
        System.out.println(n);
        System.out.println("calling function again for n - 1: " + (n -1));
        printN(n - 1);
    }

    public static void main(String[] args) {
        printN(4);
    }
}