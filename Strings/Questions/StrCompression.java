public class StrCompression {
    static String toCompress(String s) {
        StringBuilder sb = new StringBuilder("");
        Integer count = 1;

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
                sb.append(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
            count = 1;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbccccd";

        System.out.println(toCompress(s));
    }
}

// aaabbbccc => 3a3b3c