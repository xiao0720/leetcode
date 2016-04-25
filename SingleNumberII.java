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
            if (map.containsKey(num)) {
                if (map.get(num) == 2) {
                    map.remove(num);
                } else {
                    map.put(num, 2);
                }
            } else {
                map.put(num, 1);
            }
        }
        return (Integer) map.keySet().toArray()[0];
    }
}
