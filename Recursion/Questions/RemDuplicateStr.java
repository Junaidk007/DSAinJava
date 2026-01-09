public class RemDuplicateStr {
    public static String removeStr(String s, int i, boolean[] seen ) {
        if (i == s.length()) return "";

        char currChar = s.charAt(i);

        if (seen[currChar - 'a']) {  // if the char is repeated then only return the previous function value
            return removeStr(s, i + 1, seen);
            
        } else {  // if the char is not repeated then update the seen array to true and then return current char + previous function value
            seen[currChar - 'a'] = true;
            return currChar + removeStr(s, i + 1, seen);
        }
    }

    public static void main(String[] args) {
        boolean[] seen = new boolean[26]; // to check if the char is repeating in the string or not
        String s = "hello";
        System.out.println(removeStr(s, 0, seen));
    }
}

