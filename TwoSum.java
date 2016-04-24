import java.util.HashMap;
import java.util.Hashtable;

/**
 * Problem: #1 Two Sum
 *
 * Idea: iterate through each number in the nums, compare the difference between target
 * and the current number, find if the difference exists as an item in the rest of the
 * array nums.
 *
 * Solutions:
 *  twoSum: Brute Force O(n^2)
 *  twoSumHash2: Use hash table to trade space for time O(n)
 *  twoSumHash: One loop, examining and add new.
 */

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j< nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Now solution found.");
    }

    private static int[] twoSumHash2(int[] nums, int target) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hash.containsKey(diff) && hash.get(diff) != i) {
                return new int[] {i, hash.get(diff)};
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    private static int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hash.containsKey(complement) && hash.get(complement) != i) {
                return new int[] {hash.get(complement), i};
            }
            hash.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solutions found");
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] result0 = twoSum(nums, target);
        int[] result1 = twoSumHash2(nums, target);
        int[] result2 = twoSumHash(nums, target);

        System.out.println("[" + result0[0] + ", " + result0[1] + "]");
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
  }
}
