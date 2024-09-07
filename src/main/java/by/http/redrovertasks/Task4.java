package by.http.redrovertasks;

import java.util.Arrays;

public class Task4 {

  public static void main(String[] args) {
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

/**    Задача №1
 Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 необходимо вывести все нечетные числа из массива.
 */{
      System.out.println("Задача 4.1");
      for (int num : array) {
        if (num % 2 != 0) {
          System.out.print(num + " ");
        }
      }
    }
    /**       Задача №2
     Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести все значения массива больше 5.
     */
    {
      System.out.println("Задача 4.2 Stream");
      Arrays.stream(array).filter(num -> num > 5).forEach(System.out::print);
    }
    {
      for (int i = 0; i < array.length; i++) {
        if (array[i] > 5) {
          System.out.print(array[i] + " ");
        }
      }
    }
/**    Задача №3
 Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 необходимо увеличить все значения массива на 15.
 */{
      System.out.println("Задача 4.3");
      for (int i = 0; i < array.length; i++) {
        array[i] += 15;
      }
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
    }

    {
      System.out.println("Задача 4.3 V-2.0");
      for (int i = 0; i < array.length; i++) {
        array[i] = array[i] + 15;
      }
      for (int num : array) {
        System.out.print(num + " ");
      }
    }
/**
 Задача со звездочкой
 Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
 Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ).
 Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
 */
    {
      System.out.println("Задача 4.*");
      int left = 0;
      int right = array2.length - 1;
      while (left < right) {
        int temp = array2[left];
        array2[left] = array2[right];
        array2[right] = temp;
        left++;
        right--;
      }
      for (int num : array2) {
        System.out.print(num + " ");
      }
    }
    {
      System.out.println("Задача 4.* V-2.0");
      for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
      }
      for (int num : array) {
        System.out.print(num + " ");
      }
    }
  }
}
