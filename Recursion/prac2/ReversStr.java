package Recursion.prac2;

public class ReversStr {
    public static String revStr(String s, int i) {
        StringBuilder sb = new StringBuilder("");

        if (i == s.length()) {
            return s;
        }

        String id = revStr(s, i + 1);

        sb.append(s.charAt(i));

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "car";

        System.out.println(revStr(str, 0));
    }
}
