package by.http.redrovertasks.task6;

public class Manager extends Worker {

  private int numberOfSubordinates;

  public Manager(double baseSalary) {
    super(baseSalary);
  }

  public Manager() {
    super();
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
      return super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3);
    }
  }
}
