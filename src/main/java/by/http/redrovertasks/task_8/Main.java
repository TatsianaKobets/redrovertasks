package by.http.redrovertasks.task_8;

import static by.http.redrovertasks.task_8.Task8_1.numberToWords;
import static by.http.redrovertasks.task_8.TaxCalculator.calculateTaxes;

public class Main {

  /**
   * Задача №1
   * <p>
   * Написать статический метод, превращающий натуральное (целое положительное) число (например,
   * 643) в строку, состоящую из названий цифр этого числа (например, “шесть четыре три”).
   * <p>
   * Задача №2
   * <p>
   * Создать класс Employee, в котором хранится информация о сотруднике предприятия: имя, месячная
   * зарплата, количество детей. Создать класс TaxPayment, в котором будет храниться имя сотрудника
   * и сумма подоходного налога, который он должен будет заплатить. Создать метод, который получит
   * массив сотрудников, и вернет (или распечатает, но лучше, если вернет) массив налоговых выплат
   * (TaxPayment) по следующему правилу: Если зарплата больше 10000, то налоговая ставка 23% Если
   * зарплата от 5000 до 10000, то налог составляет 18% Если зарплата меньше 5000, то налог
   * составляет 13% За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся
   * суммы.
   * <p>
   * Задача №3
   * <p>
   * (на подумать, сложная) Я читаю студентам некий курс, состоящий из 10 занятий. Мне нужен класс,
   * который представляет собой классный журнал. Этот журнал содержит список студентов (фамилии
   * придумайте сами) и “клеточки” для выставления оценок (подсказка — как лучше хранить имя
   * студента и все его оценки вместе?)
   * <p>
   * Класс должен иметь следующие возможности (реализованные как методы): Поставить оценку любому
   * студенту за любое занятие (по номеру занятия). Распечатать все оценки всех студентов за одно
   * занятие (по номеру) Распечатать все оценки всех студентов за весь курс Посчитать средний балл
   * любого студента.
   */
  public static void main(String[] args) {
    System.out.println("Задача 8.1");
    System.out.println(numberToWords(643)); // "шесть четыре три"

    System.out.println("\nЗадача 8.2");
    Employee[] employees = new Employee[]{
        new Employee("Иван", 12000, 2),
        new Employee("Петр", 8000, 1),
        new Employee("Сергей", 4000, 0)
    };

    TaxPayment[] taxPayments = calculateTaxes(employees);

    for (TaxPayment taxPayment : taxPayments) {
      System.out.println("Имя: " + taxPayment.getName() + ", Налог: " + taxPayment.getTaxAmount());
    }

    System.out.println("\nЗадача 8.3");
    ClassJournal journal = new ClassJournal(5);

    journal.setGrade("Student 1", 1, 5);
    journal.setGrade("Student 2", 1, 3);
    journal.setGrade("Student 3", 1, 4);

    journal.printGradesForLesson(1); //  Student 1: 5, Student 2: 3, Student 3: 4

    journal.printGradesForStudent("Student 1"); // Lesson 1: 5

    journal.printGradesForCourse("Student 1"); // Lesson 1: 5

    double averageGrade = journal.calculateAverageGrade("Student 1");
    System.out.println("Average grade: " + averageGrade); // Average grade: 5.0

  }
}
