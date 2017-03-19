import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static void main(String[] args) {
    System.out.println(new SingleNumber().singleNumber(new int[] {1,1,2,2,3}));
    System.out.println(new SingleNumber().singleNumber(new int[] {1}));
  }

  public int singleNumber(int[] nums) {
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      result ^= nums[i];
    }

    return result;
  }
}