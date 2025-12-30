import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        String str = "Hello world";  // Method 1 of string initialization
        String str0 = new String("Hello World"); // Method 2 of string initialization

        // Taking String input form user
        Scanner sc = new Scanner(System.in);
        String userStr = sc.next(); // sc.next() function takes only 1st word and skips all other.
        sc.nextLine();
        String userStr0 = sc.nextLine(); // sc.nextLine() function takes full length string inluding spaces.

        // Printing String

        System.out.println(str);
        System.out.println(str0);
        System.out.println(userStr);
        System.out.println(userStr0);

        sc.close();
    }
}