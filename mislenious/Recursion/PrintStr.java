public class PrintStr {
    public static void printStr(String s) {
        if (s.length() == 0) return;
        System.out.println(s.charAt(0));
        printStr(s.substring(1));
    }

    public static void main(String[] args) {
        printStr("abcd");
    }
}
