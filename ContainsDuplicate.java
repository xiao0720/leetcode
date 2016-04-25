import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem: #217 Contains Duplicate
 *
 * Idea:
 *
 * Solutions:
 *  containsDuplicateHash: using a hash set to store unique characters found.
 *  containsDuplicateSort: sort then find. This exceeds the time limit.
 *
 */
public class ContainsDuplicate {
    public boolean containsDuplicateHash(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
