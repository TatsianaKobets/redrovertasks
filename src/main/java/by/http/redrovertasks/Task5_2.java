package by.http.redrovertasks;

import java.util.Arrays;

public class Task5_2 {

  public static void main(String[] args) {
    String[][] arrayStrings = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"},
        {"java"}};

    /**Задача №1

     Дана строка:
     String s = “Перестановочный алгоритм быстрого действия”;
     необходимо вывести все буквы “о” из этой строки.
     Для указанной строки ответ будет “ооооо” (или в столбик)
     */{
      System.out.println("Задача 5.2 - 1");
      String s = "Перестановочный алгоритм быстрого действия";
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'о') {
          System.out.println("о");
        }
      }
    }

    /** Задача №2
     Дана строка:
     String s = “Перевыборы выбранного президента”;
     необходимо подсчитать количество букв “е” в строке.
     Для указанной строки ответ будет 4.
     */
    {
      System.out.println("Задача 5.2 - 2");
      String s = "Перевыборы выбранного президента";
      int count = 0;
      for (char c : s.toCharArray()) {
        if (c == 'е') {
          count++;
        }
      }
      System.out.println("Количество букв 'е': " + count);
    }
    /** Экстра задача №1
     Дана строка:
     String s = “Посмотрите как Рите нравится ритм”;
     необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
     Для указанной строки ответ будет 6, 15, 29.
     */
    {
      System.out.println("Задача 5.2 - *1");
      String s = "Посмотрите как Рите нравится ритм";
      String sub = "рит";
      int index = s.toLowerCase().indexOf(sub.toLowerCase());
      while (index != -1) {
        System.out.println(index);
        index = s.toLowerCase().indexOf(sub.toLowerCase(), index + 1);
      }
    }
    /**Экстра задача №2
     Дан массив:
     String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
     необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
     */
    {
      System.out.println("Задача 5.2 - *2");
      int count = 0;
      for (String[] row : arrayStrings) {
        boolean containsE = false;
        for (String str : row) {
          if (str.toLowerCase().contains("е")) {
            containsE = true;
            break;
          }
        }
        if (!containsE) {
          count++;
        }
      }
      System.out.println("Количество строк без буквы 'е': " + count);
    }
    {
      System.out.println("Задача 5.2 - *3 V-2.0");
      int count = 0;
      for (String[] row : arrayStrings) {
        if (!Arrays.stream(row).anyMatch(str -> str.toLowerCase().contains("е"))) {
          count++;
        }
      }
      System.out.println("Количество строк без буквы 'е': " + count);
    }
  }
}
