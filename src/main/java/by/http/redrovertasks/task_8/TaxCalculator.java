package by.http.redrovertasks.task_8;

public class TaxCalculator {

  public static TaxPayment[] calculateTaxes(Employee[] employees) {
    TaxPayment[] taxPayments = new TaxPayment[employees.length];

    for (int i = 0; i < employees.length; i++) {
      Employee employee = employees[i];
      double salary = employee.getSalary();
      int childrenCount = employee.getChildrenCount();

      // вычитаем из зарплаты сумму за детей
      salary -= childrenCount * 1000;

      double taxRate;
      if (salary > 10000) {
        taxRate = 0.23;
      } else if (salary >= 5000) {
        taxRate = 0.18;
      } else {
        taxRate = 0.13;
      }

      double taxAmount = salary * taxRate;

      taxPayments[i] = new TaxPayment(employee.getName(), taxAmount);
    }

    return taxPayments;
  }
}
