public class ReverseString {
  public static void main(String[] args) {
    System.out.println(new ReverseString().reverseString("Hello"));
  }

  public String reverseString(String s) {
    int length = s.length();
    char[] string = new char[length];

    for(int i = 0; i < length; i++) {
      string[i] = s.charAt(length - 1 - i);
    }

    return String.valueOf(string);
  }
}