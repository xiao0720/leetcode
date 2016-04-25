import java.util.HashMap;

/**
 * Problem: #137 Single Number II
 *
 * Idea:
 *
 * Solutions:
 *  singleNumberSet: using a hash set to store unique characters found.
 *
 * Note: #canbefaster
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else if (count == 2) {
                map.remove(num);
            } else {
                map.put(num, 2);
            }
        }
        return (Integer) map.keySet().toArray()[0];
    }
}
