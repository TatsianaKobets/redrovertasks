package by.http.redrovertasks.task6.apptask6_3;

public class Manager extends Worker {

  private int numberOfSubordinates;

  public Manager(String name, double baseSalary) {
    super(name, baseSalary);
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

  public double getBonuses() {
    if (numberOfSubordinates == 0) {
      return 0.0;
    } else {
      return super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3);
    }
  }
}

