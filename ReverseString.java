/**
 * Problem: #344 Reverse String
 *
 * Idea: iterate through each character inside the string and append to a new string
 *
 * Solutions:
 *  reverseString: use StringBuilder for efficiently string building
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
