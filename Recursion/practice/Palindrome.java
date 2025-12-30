
public class Palindrome {
    static boolean checkPal(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return checkPal(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String s = "hello";

        if (checkPal(s)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}


    // static String reverseStr(String str) {
    //     if (str.length() <= 1) {
    //         return str;
    //     }
    //     return reverseStr(str.substring(1)) + str.charAt(0);
    // }
    // public static void main(String[] args) {
    //     String str = "madam";
    //     String rev = reverseStr(str);

    //     if (str.equals(rev)) {
    //         System.out.println("string is palindrome");
    //     } else {
    //         System.out.println("string is not palindrome");
    //     }
    // }