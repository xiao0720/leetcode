import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public static void main(String[] args) {
    int[] nums = {0, 4, 3, 0};
    int target = 0;
    int[] result = twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }

  // Brute Force
  // public static int[] twoSum(int[] nums, int target) {
  //   for (int i = 0; i < nums.length; i++) {
  //     for(int j = i + 1; j < nums.length; j ++) {
  //       if((nums[i] + nums[j]) == target) {
  //         return new int[] {i, j};
  //       }
  //     }
  //   }
  //   return null;
  // }

  // One-pass HashMap
  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i ++) {
      int diff = target - nums[i];
      if (map.containsKey(diff)) {
        return new int[] {map.get(diff), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}
