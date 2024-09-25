package by.http.redrovertasks.task6.task6_3;

public class Employee {
  private double baseSalary;
  private String name;

  public Employee(String name, double baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }

  public Employee() {

  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return baseSalary;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }
}
