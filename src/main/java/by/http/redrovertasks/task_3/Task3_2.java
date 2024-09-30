package by.http.redrovertasks.task_3;

public class Task3_2 {

  public static void main(String[] args) {
    {
      System.out.println("Задача 3.2.1");
      /** Задача №3.1
       * Необходимо вывести числа от 0 до 15.*/
      for (int i = 0; i <= 15; i++) {
        System.out.println(i);
      }
    }
    {
      System.out.println("Задача 3.2.2");

      /** Задача №2
       * Необходимо вывести все положительные степени
       * числа 5 которые меньше 10000, вывести результат возведения в степень.
       * */
      int base = 5;
      int max = 10000;
      int exponent = 0;
      long result;

      while (true) {
        result = (long) Math.pow(base, exponent);
        if (result >= max) {
          break;
        }
        System.out.println(base + " в степени " + exponent + " равно " + result);
        exponent++;
      }
    }
    {
      System.out.println("Задача 3.2.3");
      /** Задача №3
       Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
       Реализовать 2 варианта:
       использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
       без использования конструкции if (шаг цикла на ваше усмотрение).
       */
      for (int i = 40; i <= 60; i++) {
        if (i % 4 == 0) {
          System.out.println(i);
        }
      }
      /*
      for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
         */
    }
  }

}
