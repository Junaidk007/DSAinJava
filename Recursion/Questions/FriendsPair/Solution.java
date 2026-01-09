
public class Solution {
    public static int pairFrnds(int n) {
        if (n == 1 || n == 2) return n;  // if no.of friends is 1 or 2 then the no.of ways = no.of friends

        // friends have two choices ethir stay single or be in pair 

        // choice 1 
        int single = pairFrnds(n - 1); 

        // choice 2 
        int pair = (n - 1) * pairFrnds(n - 2);

        // total no.of ways
        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(pairFrnds(5));
    }
}
