public class MoveZeros {
  // Initial solution
  public void moveZeroes(int[] nums) {
    int j;
    int counter = 0;

    for (int num : nums) {
      if (num == 0) {
        counter++;
      }
    }

    for (int i = 0; i < nums.length - counter; i++) {
      if (nums[i] == 0) {
        j = i;
        while (nums[j] == 0 && j < nums.length - 1) {
          j++;
        }
        nums[i] = nums[j];
        nums[j] = 0;
      }
    }
  }

  // Optimal solution, think about best and worst cases
  public void moveZeroesOptimal(int[] nums) {
    int nonZero = 0;
    for (int current = 0; current < nums.length; current++) {
      if (nums[current] != 0) {
        int tmp = nums[nonZero];
        nums[nonZero++] = nums[current];
        nums[current] = tmp;
      }
    }
  }
}