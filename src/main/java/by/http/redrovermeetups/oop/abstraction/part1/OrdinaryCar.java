package by.http.redrovermeetups.oop.abstraction.part1;

public class OrdinaryCar extends AbstractCar {

  public OrdinaryCar(String model, String color, int yearOfProduction) {
    super(model, color, yearOfProduction);
}

  @Override
  void drive() {
    System.out.println("Движение обычного автомобиля: " + model);
  }

  @Override
  void openTheDoor() {
    System.out.println("5-х дверные автомобиль: " + model);
  }

  @Override
  void brake() {
    System.out.println("Торможение обычного автомобиля: " + model);
  }
}
