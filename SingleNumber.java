import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Problem: #136 Single Number
 *
 * Idea:
 *
 * Solutions:
 *  singleNumberMap: using a hash map to store unique characters found.
 *  singleNumberSet: using a hash set to store unique characters found.
 *  singleNumberSort:
 *
 * Note: #canbefaster
 */
public class SingleNumber {
    public int singleNumberMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return (Integer) map.keySet().toArray()[0];
    }

    public int singleNumberSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return (Integer) set.toArray()[0];
    }


    /**
     * Need to sort the array first.
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i+=2) {
            if (nums[i] != nums[i+1]) return nums[i];

        }
        return -1;
    }
}
