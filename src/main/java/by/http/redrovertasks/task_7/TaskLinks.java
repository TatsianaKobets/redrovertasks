package by.http.redrovertasks.task_7;

public class TaskLinks {

  /**
   * @param i
   * @return
   */
  public static int doubleInteger(int i) {
    // Double the integer and return it
    return i * 2;
  }

  /**
   * Тимми и Сара думают, что влюблены, но где они живут, они узнают об этом только тогда, когда
   * сорвут каждый по цветку. Если у одного цветка четное количество лепестков, а у другого
   * нечетное, это означает, что они влюблены.
   * <p>
   * Напишите функцию, которая будет принимать количество лепестков каждого цветка и возвращать
   * true, если они влюблены, и false, если нет.
   *
   * @param timmyFlower
   * @param saraFlower
   * @return
   */
  public static boolean isLove(int timmyFlower, int saraFlower) {
    return (timmyFlower % 2 == 0 && saraFlower % 2 != 0) || (timmyFlower % 2 != 0
        && saraFlower % 2 == 0);
  }

  /**
   * * Нам нужна функция, которая может преобразовать число (целое) в строку. * * Какие способы
   * достижения этой цели вы знаете? * * Примеры (ввод -> вывод): * 123 --> "123" * 999 --> "999" *
   * -100 --> "-100"
   */
  public static String numberToString(int num) {
    return String.valueOf(num);
  }

  /**
   * Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.
   * <p>
   * Например:
   * <p>
   * Учитывая [34, 15, 88, 2], ваше решение вернет 2 Учитывая [34, -345, -1, 100], ваше решение
   * вернет -345. Для целей этого ката вы можете предположить, что предоставленный массив не будет
   * пустым.
   */

  public static int findSmallestInt(int[] args) {
    // return IntStream.of(args).min().getAsInt();
    int smallest = args[0];
    for (int i = 1; i < args.length; i++) {
      if (args[i] < smallest) {
        smallest = args[i];
      }
    }
    return smallest;
  }

  /**
   * Учитывая неотрицательное целое число, например 3, верните строку с бормотанием: «1 овца...2
   * овцы...3 овцы...». Ввод всегда будет действительным, т. е. без отрицательных целых чисел.
   */
  public static String countingSheep(int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      result.append(i).append(" sheep...");
    }
    return result.toString();
  }
}
