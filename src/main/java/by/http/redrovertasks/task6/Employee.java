package by.http.redrovertasks.task6;

public class Employee {

  private double baseSalary;
  private String name;

  public Employee() {
  }

  public Employee(String name, double baseSalary) {
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
    return baseSalary + getBonuses();
  }

  public double getBonuses() {
    return 0.0;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }
}
