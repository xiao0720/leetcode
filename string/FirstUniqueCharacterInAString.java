import java.util.Set;
import java.util.HashSet;

public class FirstUniqueCharacterInAString {
  public int firstUniqChar(String s) {
    int l = s.length();
    int[] count = new int[128];

    for (int i = 0; i < l; i++) {
      count[s.charAt(i)]++;
    }

    for (int j = 0; j < l; j++) {
      if (count[s.charAt(j)] == 1) {
        return j;
      }
    }
    return -1;
  }
}