/**
 * Problem: #338 Counting Bits
 *
 * Idea:
 *
 * Solutions:
 *
 * Note: #canbefaster
 *
 */

public class CountingBits {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for (int i = 0; i <= num; i++) {
            String string = Integer.toBinaryString(i);
            int counter = 0;
            for (int j = 0; j < string.length(); j++) {
                if ((string.charAt(j)) == '1') counter ++;
            }
            result[i] = counter;
        }
        return result;
    }
}
