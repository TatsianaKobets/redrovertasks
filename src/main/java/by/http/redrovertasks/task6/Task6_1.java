package by.http.redrovertasks.task6;

public class Task6_1 {

  /**
   * Задача 6.1. Необходимо создать класс Employee со следующими методами: getBaseSalary - получить
   * базовую ставку setBaseSalary getName - получить имя setName getSalary - получить зарплату
   */

  public static void main(String[] args) {
    System.out.println("Задача 6.1");
    Employee employee = new Employee();
    employee.setName("Jane");
    employee.setBaseSalary(2000.0);
    System.out.println(
        "Зарплата " + employee.getName() + ": " + "базовая ставка " + employee.getBaseSalary()
            + "; общая зарплата " + employee.getSalary());
  }
}
