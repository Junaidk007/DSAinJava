
// Question 4 :Determine if 2 Strings areanagrams of each other.
// race care
// race.indexOf(charAt(care))
public class Question4 {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        int[] freq = new int[26];  

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "race";
        String b = "care";
        String c = "goal";
        String d = "racc";

        if (isAnagram(a, d)) {
            System.out.println("Strings are anagrams");
        } else {
            System.err.println("Strings are not anagrams");
        }
    }

}

// static boolean isAnagram(String a, String b) {
//     boolean ans = false;
//     for (int i = 0; i < b.length(); i++) {
//         if (a.indexOf(b.charAt(i)) != -1) {
//             ans = true;
//         } else {
//             ans = false;
//         }
//     }
//     return ans;
// }
// public static void main(String[] args) {
//     String a = "race";
//     String b = "care";
//     String c = "goal";
//     if (isAnagram(a, c)) {
//         System.out.println("Strings are anagrams");
//     } else {
//         System.err.println("Strings are not anagrams");
//     }
    // }
