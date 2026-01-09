
public class Solution {
    public static int solution(int n) {
        if (n == 0 || n == 1) return 1;

        int var = solution(n - 1);
        int hor = solution(n - 2);

        int totalWays = var + hor;

        return  totalWays;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
