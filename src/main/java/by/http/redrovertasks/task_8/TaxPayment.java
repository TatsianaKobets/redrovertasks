package by.http.redrovertasks.task_8;

public class TaxPayment {

  private String name;
  private double taxAmount;

  public TaxPayment(String name, double taxAmount) {
    this.name = name;
    this.taxAmount = taxAmount;
  }

  public String getName() {
    return name;
  }

  public double getTaxAmount() {
    return taxAmount;
  }
}
