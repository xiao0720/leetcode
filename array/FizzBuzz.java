import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class FizzBuzz {
  public static void main(String[] args) {

    List<String> string = new FizzBuzz().fizzBuzz(15);
    for (String s: string) {
      System.out.println(s);
    }

  }

  public List<String> fizzBuzz(int n) {
    List<String> list = new LinkedList<>();

    for (int i = 1; i <= n; i++) {
      list.add(getString(i));
    }
    return list;
  }

  private String getString(int i) {
    if (i % 15 == 0) {
      return "FizzBuzz";
    } else if (i % 3 == 0) {
      return "Fizz";
    } else if (i % 5 == 0) {
      return "Buzz";
    } else {
      return Integer.toString(i);
    }
  } 
}