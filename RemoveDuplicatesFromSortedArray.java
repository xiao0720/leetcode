/**
 * Problem: #26 Remove Duplicates from Sorted Array
 *
 * Idea: One point to count numbers of elements to delete, the other is for the current
 * position to store the values that are not going to be deleted.
 *
 * Solutions:
 *  removeElement: two pointers
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int currentPosition = 1;
        int currentValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != currentValue) {
                nums[currentPosition] = nums[i];
                currentPosition ++;
                currentValue = nums[i];
            }
        }
        return currentPosition;
    }

/*    public static void main(String[] args) {
        int[] array = new int[] {1,1,2};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }*/
}
