public class ReverseStr {
    static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        System.out.println(str);
        return reverseStr(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println(reverseStr(str));
    }
}
 
// rev(abcd)
// rev(abcd.substring(1)) + a
// rev(bcd.substring(1)) + b
// rev(cd.substring(1)) + c
// rev(d.substring(1)) + d