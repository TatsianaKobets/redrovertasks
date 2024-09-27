package by.http.redrovertasks.task_8;

public class Employee {

  private String name;
  private double salary;
  private int childrenCount;

  public Employee(String name, double salary, int childrenCount) {
    this.name = name;
    this.salary = salary;
    this.childrenCount = childrenCount;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public int getChildrenCount() {
    return childrenCount;
  }
}
