package by.http.redrovertasks.task6;

public class Task6_2 {

  /**
   * Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
   * <p>
   * Необходимо создать класс Manager в который нужно добавить следующие методы:
   * getNumberOfSubordinates - получить количество подчиненных setNumberOfSubordinates
   * <p>
   * в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> *
   * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у
   * обычного рабочего.
   * <p>
   * Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен
   * возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если
   * количество подчиненных 0, то результат как у обычного рабочего.
   */

  public static void main(String[] args) {
    System.out.println("Задача 6.2");
    Worker worker = new Worker(10000);
    System.out.println("Зарплата рабочего: " + worker.getSalary());

    Manager manager = new Manager(10000);
    manager.setNumberOfSubordinates(50);

    System.out.println("Зарплата менеджера: "
        + "из расчета на количество подчиненных: " + manager.getNumberOfSubordinates()
        + " Общая зарплата: " + manager.getSalary());

    Director director = new Director(10000);
    director.setNumberOfSubordinates(1500);
    System.out.println("Зарплата директора: "
        + "из расчета на количество подчиненных: " + director.getNumberOfSubordinates()
        + " Общая зарплата: " + director.getSalary());
  }
}