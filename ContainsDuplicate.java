import java.util.ArrayList;

/**
 * Problem: #217 Contains Duplicate
 *
 * Idea:
 *
 * Solutions:
 *  singleNumberHash: using a hash map to store unique characters found.
 *  singleNumber:
 *
 * Note: #canbefaster
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) return true;
            list.add(num);
        }
        return false;
    }
}
