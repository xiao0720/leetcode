import java.util.HashMap;

/**
 * Problem: #136 Single Number
 *
 * Idea:
 *
 * Solutions:
 *  singleNumberHash: using a hash map to store unique characters found.
 *  singleNumber:
 *
 * Note: #canbefaster
 */
public class SingleNumber {
    public int singleNumberHash(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return (Integer) map.keySet().toArray()[0];
    }

    /**
     * Need to sort the array first.
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        //Net
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                i ++;
            } else {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("No solution found.");
    }
}
