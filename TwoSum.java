/**
 * Problem: #1 Two Sum
 * Author: xiao0720
 * Idea: iterate through each number in the nums, compare the difference between target
 * and the current number, find if the difference exists as an item in the rest of the
 * array nums.
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int i, j;

        for (i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            for (j = i + 1; j< nums.length; j++) {
                if (diff == nums[j]) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
  }
}
