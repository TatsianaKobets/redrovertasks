package by.http.redrovertasks;

import java.util.Arrays;

public class Task5_1 {

  public static void main(String[] args) {
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    /**Задача №1
     Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести сумму всех значений массива.
     */
    {
      System.out.println("Задача 5.1");
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum += array[i];
      }
      System.out.println("Сумма всех значений массива: " + sum);

    }
    /**Задача №2
     Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести максимальное значение массива.
     */
    {
      System.out.println("Задача 5.2");
      int max = array[0];
      for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
          max = array[i];
        }
      }
      System.out.println("Максимальное значение массива: " + max);

    }
    /**Задача №3
     Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести минимальное значение массива.
     */
    {
      System.out.println("Задача 5.3");
      int min = array[0];
      for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
          min = array[i];
        }
      }
      System.out.println("Минимальное значение массива: " + min);
    }
    /**Задача №4
     Дан массив: int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     необходимо вывести среднее арифметическое всех значений массива.
     */
    {
      System.out.println("Задача 5.4 Stream");
      double average = Arrays.stream(array).average().getAsDouble();
      System.out.println("Среднее арифметическое всех значений массива (Stream): " + average);
    }
    {
      System.out.println("Задача 5.4");
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum += array[i];
      }
      double average = (double) sum / array.length;
      System.out.println("Среднее арифметическое всех значений массива: " + average);
    }

    /** Задача №5
     Дан массив: int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести сумму элементов массива.
     */{
      System.out.println("Задача 5.5 Stream");
      int sum = Arrays.stream(array2)
          .mapToInt(row -> Arrays.stream(row).sum())
          .sum();
      System.out.println("Сумма элементов массива (Stream): " + sum);
    }

    {
      System.out.println("Задача 5.5");
      int sum = 0;
      for (int[] row : array2) {
        for (int element : row) {
          sum += element;
        }
      }
      System.out.println("Сумма элементов массива: " + sum);
    }

    /** Задача №6
     Дан массив:
     int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести максимальное значение массива.
     */{
      System.out.println("Задача 5.6");
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < array2.length; i++) {
        for (int j = 0; j < array2[i].length; j++) {
          if (array2[i][j] > max) {
            max = array2[i][j];
          }
        }
      }
      System.out.println("Максимальное значение массива: " + max);

    }

    /**
     Задача №7
     Дан массив:
     int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     необходимо вывести количество элементов в массиве.
     */{
      System.out.println("Задача 5.7");
      int count = 0;
      for (int i = 0; i < array2.length; i++) {
        count += array2[i].length;
      }
      System.out.println("Количество элементов в массиве: " + count);
    }
  }
}

