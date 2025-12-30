public class LargestString {
    static String largeString(String[] s) {
        String largest = s[0];

        for (int i = 1; i < s.length; i++) {
            if (largest.compareTo(s[i]) < 0) {
                largest = s[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] s = {"apple", "mango", "banana"};

        System.out.println(largeString(s));
    }
}
