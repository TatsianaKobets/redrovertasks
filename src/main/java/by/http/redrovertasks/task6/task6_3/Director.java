package by.http.redrovertasks.task6.task6_3;

public class Director extends Worker {

  private int numberOfSubordinates;

  public Director(String name, double baseSalary) {
    super(name, baseSalary);
  }

  public Director() {
    super();
  }

  public int getNumberOfSubordinates() {
    return numberOfSubordinates;
  }

  public void setNumberOfSubordinates(int numberOfSubordinates) {
    this.numberOfSubordinates = numberOfSubordinates;
  }

  public double getBonuses() {
    if (numberOfSubordinates == 0) {
      return 0.0;
    } else {
      return super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9);
    }
  }
}
