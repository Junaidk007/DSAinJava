public class StrCompression {
    static String toCompress(String s) {
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
        }
    }
}

// aaabbbccc => 3a3b3c