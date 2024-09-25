package by.http.redrovermeetups.oop.polimorf.part3;

public class OrdinaryCar extends AbstractCar {

  private String ownerName;

  public OrdinaryCar(String model, String color, int yearOfProduction, String ownerName) {
    super(model, color, yearOfProduction);
    this.ownerName = ownerName;
  }

  @Override
  void drive() {
    System.out.println("Движение обычного автомобиля, модель: " + model);
  }

  @Override
  void openTheDoor() {
    System.out.println("Автомобиль 5-и дверный");
  }

  @Override
  void brake() {
    System.out.printf("Торможение обычного автомобиля: %s - плавное%n", model);
  }

  @Override
  void refuel(String fuelType) {
    System.out.println("Обычный автомобиль заправляется " + fuelType);
  }
  void refuel(int liters) {
    System.out.println("Обычный автомобиль заправляется " + liters + " литров топлива.");
  }

  void refuel() {
    System.out.println("Обычный автомобиль заправляется по умолчанию.");
  }

  @Override
  public String toString() {
    return "OrdinaryCar{" +
        "ownerName='" + ownerName + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }
}

