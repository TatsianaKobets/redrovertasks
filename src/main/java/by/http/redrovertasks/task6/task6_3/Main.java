package by.http.redrovertasks.task6.task6_3;

public class Main {

  public static void main(String[] args) {
    System.out.println("Задание 6.3");
    // Create employees
    Employee employee1 = new Employee();
    employee1.setName("Employee 1");
    employee1.setBaseSalary(5000.0);
    Employee employee2 = new Employee();

    // Create managers
    Manager manager1 = new Manager("Manager 1", 7000.0);
    manager1.setNumberOfSubordinates(10);
    Manager manager2 = new Manager("Manager 2", 8000.0);
    manager2.setNumberOfSubordinates(20);

    // Create directors
    Director director1 = new Director("Director 1", 9000.0);
    director1.setNumberOfSubordinates(30);
    Director director2 = new Director("Director 2", 10000.0);
    director2.setNumberOfSubordinates(40);

    // Add employees to an array
    Employee[] employees = new Employee[]{employee1, employee2, manager1, manager2, director1,
        director2};

    // Use EmployeeUtils class
    EmployeeUtils.printArray(employees);

    System.out.println(
        "Total salary budget: " + EmployeeUtils.calculateTotalSalaryBudget(employees));
    System.out.println("Min salary: " + EmployeeUtils.findMinSalary(employees));
    System.out.println("Max salary: " + EmployeeUtils.findMaxSalary(employees));

    // Use ManagerUtils class
    Manager[] managers = new Manager[]{manager1, manager2};
    System.out.println(
        "Min number of subordinates: " + EmployeeUtils.findMinNumberOfSubordinates(managers));
    System.out.println(
        "Max number of subordinates: " + EmployeeUtils.findMaxNumberOfSubordinates(managers));
    System.out.println("Max bonus: " + EmployeeUtils.findMaxBonus(managers));
    System.out.println("Min bonus: " + EmployeeUtils.findMinBonus(managers));
  }
}

