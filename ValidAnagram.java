import java.util.HashMap;

/**
 * Problem: #242 Valid Anagram
 *
 * Idea: count the character and corresponding number of times, compare the result
 *
 * Solutions:
 *  isAnagram: firstly count the letters and appearing times and save them to hashmaps,
 * compare if the two maps have the same entry set.
 *
 * Note: #canbefaster
 *
 */
public class ValidAnagram {
    public boolean haveSameLength(String s, String t) {
        return s.length() == t.length();
    }

    public HashMap<Character, Integer> hashString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 0);
            }
        }
        return map;
    }

    public boolean isAnagram(String s, String t) {
        if (haveSameLength(s, t)) {
            if (s.isEmpty()) return true;

            HashMap<Character, Integer> maps = hashString(s);

            HashMap<Character, Integer> mapt = hashString(t);

            return maps.entrySet().equals(mapt.entrySet());
        }
        return false;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("", ""));
        System.out.println(va.isAnagram("anagram", "nagaram"));
        System.out.println(va.isAnagram("rat", "car"));
        System.out.println(va.isAnagram("a", "b"));
        System.out.println(va.isAnagram("a", "a"));
    }
}
