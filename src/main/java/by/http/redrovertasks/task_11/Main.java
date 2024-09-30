package by.http.redrovertasks.task_11;

public class Main {

  public static void main(String[] args) {
    /**
     * Необходимо написать 4 метода: сложение 2х чисел вычитание 2х чисел умножение 2х чисел деление
     * 2х чисел
     * <p>
     * Для каждого метода нужно написать тест используя TestNG.
     *
     * @param a
     * @param b
     * @return
     */
    System.out.println("Задача 11.1");
    Calculator calculator = new Calculator();
    System.out.println("Сложение 2 и 3: " + calculator.add(2, 3));
    System.out.println("Вычитание 2 и 3: " + calculator.subtract(2, 3));
    System.out.println("Умножение 2 и 3: " + calculator.multiply(2, 3));
    System.out.println("Деление 2 на 3: " + calculator.divide(2, 3));
    try {
      System.out.println("Деление 2 на 0: " + calculator.divide(2, 0));
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Задача 11.2");
    /**
     * Необходимо найти и подключить в свой проект библиотеку,
     * которая позволит вам “сокращать” (abbreviate) строки.
     *
     * Пример:
     * есть строка: “Привет всем кто живет на луне!”,
     * если мы хотим сократить эту строку до 10 символов,
     * то у нас должен получится следующий результат- “Привет ...”,
     * а если до 20, то результат будет таким - “Привет всем кто ж...”.
     *
     * Результат выполнения этого задания, юнит тест подключенного метода.
     *
     * P.S. Не нужно писать такой метод самому, задача в том,
     * чтобы найти такой функционал в уже готовой библиотеке и
     * использовать его в своем проекте.
     */
    StringAbbreviator abbreviator = new StringAbbreviator();
    String originalString = "Привет всем кто живет на луне!";
    String abbreviatedString10 = abbreviator.abbreviate(originalString, 10);
    String abbreviatedString20 = abbreviator.abbreviate(originalString, 20);

    System.out.println("Оригинальная строка: " + originalString);
    System.out.println("Сокращенная строка до 10 символов: " + abbreviatedString10);
    System.out.println("Сокращенная строка до 20 символов: " + abbreviatedString20);

  }
}
