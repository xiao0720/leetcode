public class ExcelSheetColumnNumber {
  public int titleToNumber(String s) {
    int length = s.length();
    int number = 0;

    for (int i = 0; i < length; i++) {
      number += (s.charAt(i) - 'A' + 1) * Math.pow(26, length - i - 1);
    }

    return number;
  }
}