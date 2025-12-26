public class Main {
    public static void reverseArr(int nums[]) {
        int start = 0, end = nums.length-1;

        while(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++; end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {5, 8, 12, 18, 2};

        reverseArr(nums);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.println();
    }
}
