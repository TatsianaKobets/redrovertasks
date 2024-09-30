package by.http.redrovertasks.task_5;

public class Task5_3 {

  public static void main(String[] args) {
    //Вывести следующие строки с соответствующим форматированием (как пирамиды):

    /** Задача №1
     0  1  2  3  4  5  6  7  8  9
     0  1  2  3  4  5  6  7  8
     0  1  2  3  4  5  6  7
     0  1  2  3  4  5  6
     0  1  2  3  4  5
     0  1  2  3  4
     0  1  2  3
     0  1  2
     0  1
     0
     */
    {
      System.out.println("Задача 5.3_1");
      for (int i = 10; i > 0; i--) {
        for (int j = 0; j < i; j++) {
          System.out.print(j + "  ");
        }
        System.out.println();
      }
    }

    /** Задача №2

     0  1  2  3  4  5  6  7  8  9
     0  1  2  3  4  5  6  7  8
     0  1  2  3  4  5  6  7
     0  1  2  3  4  5  6
     0  1  2  3  4  5
     0  1  2  3  4
     0  1  2  3
     0  1  2
     0  1
     0

     */
    {
      System.out.println("Задача 5.3_2");
      for (int i = 10; i > 0; i--) {
        for (int j = 10 - i; j > 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
          System.out.print(j + "  ");
        }
        System.out.println();
      }
    }
    /**  Задача №3

     9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
       8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
         7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
           6 5 4 3 2 1 0 1 2 3 4 5 6
             5 4 3 2 1 0 1 2 3 4 5
               4 3 2 1 0 1 2 3 4
                 3 2 1 0 1 2 3
                   2 1 0 1 2
                     1 0 1
                       0
     */
    {
      for (int i = 9; i >= 0; i--) {
        for (int j = 9 - i; j > 0; j--) {
          System.out.print(" ");
        }
        for (int j = i; j >= 0; j--) {
          System.out.print(j + " ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
    }
  }

}
