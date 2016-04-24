import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Problem: #239 Sliding Window Maximum
 * Solutions: TBC
 */
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] list = new int[nums.length - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);

            if (i > k - 2) {
                int currentMax = 0;
                for (int num: queue) {
                    if (currentMax < num) {
                        currentMax = num;
                    }
                }
                list[i - k + 1] = currentMax;
                queue.poll();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        System.out.print(Arrays.toString(result));
    }
}
