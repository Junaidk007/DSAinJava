class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {2,7,11,15};

        int[] answer = s1.twoSum(nums, 9);

        System.out.println("["+answer[0]+", "+answer[1]+"]");
    }
}