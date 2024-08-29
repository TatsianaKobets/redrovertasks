package by.http.redrovertasks;

public class Task2 {

  /**
   * Задача №1
   * <p>
   * Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
   * на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение,
   * вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и
   * вывести результат.
   */
  public static void main(String[] args) {

    {
      System.out.println("Задача 2.1");
      int a = 10;
      int b = 5;

      System.out.println("Сложение: " + (a + b));
      System.out.println("Умножение: " + (a * b));
      System.out.println("Вычитание: " + (a - b));
      System.out.println("Деление: " + (a / b));
      System.out.println("Остаток от деления: " + (a % b));

      if (a % 2 == 0) {
        System.out.println("Переменная a четная");
      } else {
        System.out.println("Переменная a нечетная");
      }

      if (b % 2 == 0) {
        System.out.println("Переменная b четная");
      } else {
        System.out.println("Переменная b нечетная");
      }
    }

    {
      /**
       * Задача №2
       * Создать программу дележа добычи на пиратском корабле.
       * По обычаю, половина добычи идет владельцу корабля,
       * половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
       * Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
       * Вывести на экран кому сколько пиастров полагается
       * Сколько получит капитан (Джек Воробей, естественно), если он утверждает,
       * что корабль принадлежит ему?
       * Дополнительное задание со звездочкой
       * Попробовать придумать как программа может проверить правильность дележа.
       * */
      System.out.println("Задача 2.2");
      int plunder = 1000;// Размер добычи в пиастрах

      int pirates = 10;// Количество пиратов на корабле

      int ownerShare = plunder / 2;// Доля владельца корабля

      int captainShare = (plunder - ownerShare) / 2;// Доля капитана

      int pirateShare = (plunder - ownerShare - captainShare) / (pirates - 1);// Доля каждого пирата

      System.out.println("Владелец корабля получит " + ownerShare + " пиастров");
      System.out.println("Капитан получит " + captainShare + " пиастров");
      System.out.println("Каждый пират получит " + pirateShare + " пиастров");

      // Если капитан утверждает, что корабль принадлежит ему
      int captainTotalShare = ownerShare + captainShare;
      System.out.println(
          "Если капитан утверждает, что корабль принадлежит ему, он получит " + captainTotalShare
              + " пиастров");

      // Проверка правильности дележа
      int totalShare = ownerShare + captainShare + (pirateShare * (pirates - 1));
      if (totalShare == plunder) {
        System.out.println("Дележ правильный");
      } else {
        System.out.println("Дележ неправильный");
      }
    }
  }
}
