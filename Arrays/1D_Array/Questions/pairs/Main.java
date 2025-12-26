public class Main {
    public static void pairs(int nums[]) {
        int tp = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                System.out.print("("+nums[i]+", "+nums[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: "+tp); // Formula n(n-1)/2;  5(4)/2 = 10;
    }
    public static void main(String[] args) {
        int nums[] = {5, 8, 12, 18, 2};

        pairs(nums);
    }
}