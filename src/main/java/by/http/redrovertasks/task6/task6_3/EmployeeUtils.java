package by.http.redrovertasks.task6.task6_3;

import java.util.Arrays;

public class EmployeeUtils {

  public static Employee findEmployeeByName(Employee[] employees, String name) {
    for (Employee employee : employees) {
      if (employee.getName().equals(name)) {
        return employee;
      }
    }
    return null;
  }

  public static Employee findEmployeeBySubstring(Employee[] employees, String substring) {
    for (Employee employee : employees) {
      if (employee.getName().contains(substring)) {
        return employee;
      }
    }
    return null;
  }

  public static double calculateTotalSalaryBudget(Employee[] employees) {
    double totalSalary = 0.0;
    for (Employee employee : employees) {
      totalSalary += employee.getSalary();
    }
    return totalSalary;
  }

  public static double findMinSalary(Employee[] employees) {
    double minSalary = Double.MAX_VALUE;
    for (Employee employee : employees) {
      if (employee.getSalary() < minSalary) {
        minSalary = employee.getSalary();
      }
    }
    return minSalary;
  }

  public static double findMaxSalary(Employee[] employees) {
    double maxSalary = Double.MIN_VALUE;
    for (Employee employee : employees) {
      if (employee.getSalary() > maxSalary) {
        maxSalary = employee.getSalary();
      }
    }
    return maxSalary;
  }

  public static int findMinNumberOfSubordinates(Manager[] managers) {
    int minNumberOfSubordinates = Integer.MAX_VALUE;
    for (Manager manager : managers) {
      if (manager.getNumberOfSubordinates() < minNumberOfSubordinates) {
        minNumberOfSubordinates = manager.getNumberOfSubordinates();
      }
    }
    return minNumberOfSubordinates;
  }

  public static int findMaxNumberOfSubordinates(Manager[] managers) {
    int maxNumberOfSubordinates = Integer.MIN_VALUE;
    for (Manager manager : managers) {
      if (manager.getNumberOfSubordinates() > maxNumberOfSubordinates) {
        maxNumberOfSubordinates = manager.getNumberOfSubordinates();
      }
    }
    return maxNumberOfSubordinates;
  }

  public static double findMaxBonus(Manager[] managers) {
    double maxBonus = Double.MIN_VALUE;
    for (Manager manager : managers) {
      double bonus = manager.getSalary() * (manager.getNumberOfSubordinates() / 100.0 * 9);
      if (bonus > maxBonus) {
        maxBonus = bonus;
      }
    }
    return maxBonus;
  }

  public static double findMinBonus(Manager[] managers) {
    double minBonus = Double.MAX_VALUE;
    for (Manager manager : managers) {
      double bonus = manager.getSalary() * (manager.getNumberOfSubordinates() / 100.0 * 3);
      if (bonus < minBonus) {
        minBonus = bonus;
      }
    }
    return minBonus;
  }

  public static void printArray(Employee[] employees) {
    System.out.println(Arrays.toString(employees));
  }
}
