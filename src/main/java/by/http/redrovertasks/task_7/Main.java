package by.http.redrovertasks.task_7;

import static by.http.redrovertasks.task_7.Calculator.add;
import static by.http.redrovertasks.task_7.Calculator.divide;
import static by.http.redrovertasks.task_7.Calculator.multiply;
import static by.http.redrovertasks.task_7.Calculator.subtract;
import static by.http.redrovertasks.task_7.TaskLinks.countingSheep;
import static by.http.redrovertasks.task_7.TaskLinks.doubleInteger;
import static by.http.redrovertasks.task_7.TaskLinks.findSmallestInt;
import static by.http.redrovertasks.task_7.TaskLinks.isLove;
import static by.http.redrovertasks.task_7.TaskLinks.numberToString;


public class Main {

  /**
   * Задача №1
   * <p>
   * Необходимо написать 4 метода: сложение 2х чисел вычитание 2х чисел умножение 2х чисел деление
   * 2х чисел
   * <p>
   * Задачи №2
   * <p>
   * https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
   * https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
   * https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
   * https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
   * https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
   */
  public static void main(String[] args) {
    System.out.println("Задача 7.1");
    double num1 = 10.0;
    double num2 = 2.0;

    System.out.println("Сумма: " + add(num1, num2));
    System.out.println("Разница: " + subtract(num1, num2));
    System.out.println("Произведение: " + multiply(num1, num2));
    System.out.println("Частное: " + divide(num1, num2));

    System.out.println("\nЗадача 7.2");
    /**
     * https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
     */
    System.out.println("Двойная числа: " + doubleInteger(5));

    System.out.println("\nЗадача 7.3");
    /**
     * https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
     */
    System.out.println(isLove(10, 11)); // true
    System.out.println(isLove(10, 12)); // false
    System.out.println(isLove(11, 12)); // false
    System.out.println(isLove(11, 10)); // true

    System.out.println("\nЗадача 7.4");
    /**
     * https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
     */
    System.out.println(numberToString(123)); // "123"
    System.out.println(numberToString(999)); // "999"
    System.out.println(numberToString(-100)); // "-100"

    System.out.println("\nЗадача 7.5");
    /**
     * https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
     */
    int[] numbers = {5, 3, 8, 4, 2};
    int smallest = findSmallestInt(numbers);
    System.out.println("The smallest number is: " + smallest);

    System.out.println("\nЗадача 7.6");
    /**
     * https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
     */
    System.out.println(countingSheep(0));
    System.out.println(countingSheep(1));
    System.out.println(countingSheep(2));
    System.out.println(countingSheep(3));
  }
}
