public class Methods {
    public static void main(String[] args) {
        String s = "Hello, I am Junaid khan.";

        // To see the length of the string
        System.out.println(s.length());

        // TO see the individual character at any index
        System.out.println(s.charAt(4));

        // To see a particular length of string (sub string)
        System.out.println(s.substring(0, 5)); // last index is skiped.

        // To check two strings are equal or not.
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));

        // How to concat strings
        
        String concat = s1 + " " + s2;

        System.out.println(concat);
    }
}
