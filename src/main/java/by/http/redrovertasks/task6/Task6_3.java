package by.http.redrovertasks.task6;

public class Task6_3 {

  /**
   * Необходимо создать утилитарный класс (класс только со статическими полями и методами) со
   * следующими методами: поиск сотрудника в массиве по его имени поиск сотрудника в массиве по
   * вхождению указанной строки в его имени подсчет зарплатного бюджета для всех сотрудников в
   * массиве поиск наименьшей зарплаты в массиве поиск наибольшей зарплаты в массиве поиск
   * наименьшего количества подчиненных в массиве менеджеров поиск наибольшего количества
   * подчиненных в массиве менеджеров поиск наибольшей надбавки (разнице между базовой ставкой и
   * зарплатой) в массиве менеджеров поиск наименьшей надбавки (разнице между базовой ставкой и
   * зарплатой) в массиве менеджеров
   */
  public static void main(String[] args) {
    // Создаем массив сотрудников
    Employee[] employees = new Employee[5];
    employees[0] = new Employee("Иван Иванов", 50000.0);
    employees[1] = new Employee("Петр Петров", 60000.0);
    employees[2] = new Employee("Сергей Сергеев", 70000.0);
    employees[3] = new Manager(80000.0);
    ((Manager) employees[3]).setNumberOfSubordinates(10);
    employees[4] = new Director(90000.0);
    ((Director) employees[4]).setNumberOfSubordinates(20);

    // Выполняем методы EmployeeUtils
    Employee employeeByName = EmployeeUtils.findEmployeeByName(employees, "Иван Иванов");
    System.out.println("Сотрудник по имени: " + employeeByName.getName());

    Employee employeeBySubstring = EmployeeUtils.findEmployeeBySubstring(employees, "ев");
    System.out.println("Сотрудник по подстроке: " + employeeBySubstring.getName());

    double salaryBudget = EmployeeUtils.calculateSalaryBudget(employees);
    System.out.println("Зарплатный бюджет: " + salaryBudget);

    double minSalary = EmployeeUtils.findMinSalary(employees);
    System.out.println("Минимальная зарплата: " + minSalary);

    double maxSalary = EmployeeUtils.findMaxSalary(employees);
    System.out.println("Максимальная зарплата: " + maxSalary);

    Manager[] managers = new Manager[2];
    managers[0] = (Manager) employees[3];
    managers[1] = (Director) employees[4];

    int minSubordinates = EmployeeUtils.findMinSubordinates(managers);
    System.out.println("Минимальное количество подчиненных: " + minSubordinates);

    int maxSubordinates = EmployeeUtils.findMaxSubordinates(managers);
    System.out.println("Максимальное количество подчиненных: " + maxSubordinates);

    double maxAllowance = EmployeeUtils.findMaxAllowance(managers);
    System.out.println("Максимальная надбавка: " + maxAllowance);

    double minAllowance = EmployeeUtils.findMinAllowance(managers);
    System.out.println("Минимальная надбавка: " + minAllowance);
  }
}
