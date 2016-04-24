/**
 * Problem: #27 Remove Element
 *
 * Idea: One point to count numbers of elements to delete, the other is for the current
 * position to store the values that are not going to be deleted.
 *
 * Solutions:
 *  removeElement: two pointers
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[current] = nums[i];
                current ++;
            }
        }
        return current;
    }
}
