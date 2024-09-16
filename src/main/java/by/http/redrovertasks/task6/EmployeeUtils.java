package by.http.redrovertasks.task6;

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

  public static double calculateSalaryBudget(Employee[] employees) {
    double budget = 0;
    for (Employee employee : employees) {
      budget += employee.getSalary();
    }
    return budget;
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

  public static int findMinSubordinates(Manager[] managers) {
    int minSubordinates = Integer.MAX_VALUE;
    for (Manager manager : managers) {
      if (manager.getNumberOfSubordinates() < minSubordinates) {
        minSubordinates = manager.getNumberOfSubordinates();
      }
    }
    return minSubordinates;
  }

  public static int findMaxSubordinates(Manager[] managers) {
    int maxSubordinates = Integer.MIN_VALUE;
    for (Manager manager : managers) {
      if (manager.getNumberOfSubordinates() > maxSubordinates) {
        maxSubordinates = manager.getNumberOfSubordinates();
      }
    }
    return maxSubordinates;
  }

  public static double findMaxAllowance(Manager[] managers) {
    double maxAllowance = Double.MIN_VALUE;
    for (Manager manager : managers) {
      double allowance = manager.getSalary() - ((Worker) manager).getSalary();
      if (allowance > maxAllowance) {
        maxAllowance = allowance;
      }
    }
    return maxAllowance;
  }

  public static double findMinAllowance(Manager[] managers) {
    double minAllowance = Double.MAX_VALUE;
    for (Manager manager : managers) {
      double allowance = manager.getSalary() - ((Worker) manager).getSalary();
      if (allowance < minAllowance) {
        minAllowance = allowance;
      }
    }
    return minAllowance;
  }
}
