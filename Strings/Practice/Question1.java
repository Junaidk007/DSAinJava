
import java.util.Scanner;


// Question1:Count how many times lowercase vowels occurred in a String entered by the user

public class Question1 {

    // method 1

    static  int count(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    // method 2

    static int countVov(String s) {
        int count = 0;
        String vowel = "aeiou";

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        // System.out.println(count(str));

        System.out.println("vowel count is: " + countVov(str));

    }
}
