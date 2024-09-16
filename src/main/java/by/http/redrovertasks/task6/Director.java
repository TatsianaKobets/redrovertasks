package by.http.redrovertasks.task6;

public class Director extends Worker {

  private int numberOfSubordinates;

  public Director(double baseSalary) {
    super(baseSalary);
  }

  public Director() {

  }

  public int getNumberOfSubordinates() {
    return numberOfSubordinates;
  }

  public void setNumberOfSubordinates(int numberOfSubordinates) {
    this.numberOfSubordinates = numberOfSubordinates;
  }

  @Override
  public double getSalary() {
    if (numberOfSubordinates == 0) {
      return super.getSalary();
    } else {
      return super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9);
    }
  }
}
