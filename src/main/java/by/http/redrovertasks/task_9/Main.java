package by.http.redrovertasks.task_9;

public class Main {

  /**
   * Задача №1
   * <p>
   * Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод -
   * getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ”
   * если женский.
   * <p>
   * Задача №2
   * <p>
   * Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле
   * зарплата. Класс должен иметь метод isSameName(Employee employee) который возвращает true, если
   * у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
   * одинаковое имя.
   * <p>
   * Задача №3
   * <p>
   * Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
   * метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве
   * аргумента вызова метода.
   *
   * @param args
   */
  public static void main(String[] args) {
    Person person1 = new Person("John", 30, "male");
    Person person2 = new Person("Jane", 25, "female");

    Employee employee1 = new Employee("John", 30, "male", 5000.0);
    Employee employee2 = new Employee("Jane", 25, "female", 4000.0);
    Employee employee3 = new Employee("Mike", 35, "male", 6000.0);

    boolean isSameName = employee1.isSameName(employee2);

    Employee[] employeeArray = {employee1, employee2, employee3};
    Salary salary = new Salary();
    double totalSalary = salary.getSum(employeeArray);

    System.out.println("Задача 9.1");
    System.out.println("Name and gender: " + person1.getName());
    System.out.println("Name and gender: " + person2.getName());

    System.out.println("\nЗадача 9.2");
    System.out.println("Are employees with the same name? " + isSameName);

    System.out.println("\nЗадача 9.3");
    System.out.println("Total salary: " + totalSalary);
  }
}
