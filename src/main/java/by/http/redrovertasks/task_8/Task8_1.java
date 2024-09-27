package by.http.redrovertasks.task_8;

public class Task8_1 {

  private static final String[] digitNames = {
      "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
  };

  public static String numberToWords(int number) {
    StringBuilder result = new StringBuilder();
    String numStr = String.valueOf(number);

    for (char c : numStr.toCharArray()) {
      int digit = Character.getNumericValue(c);
      result.append(digitNames[digit]).append(" ");
    }

    return result.toString().trim();
  }
}
