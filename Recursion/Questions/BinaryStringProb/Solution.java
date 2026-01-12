
public class Solution {
    public static void printBinStr(int n, int lastPlace, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        printBinStr(n-1, 0, s+"0");

        if (lastPlace == 0) {
            printBinStr(n - 1, 1, s+"1");
        }
    }

    public static void main(String[] args) {
        printBinStr(3, 0, "");
    }
}
