package by.http.redrovermeetups.oop.abstraction.part1;

public class SportCar extends AbstractCar {

  public SportCar(String model, String color, int yearOfProduction) {
    super(model, color, yearOfProduction);
  }

  void skid() {
    System.out.println("Машину заносит на высокой скорости");
  }

  @Override
  void drive() {
    System.out.println("Движение спортивного автомобиля: " + model);
  }

  @Override
  void openTheDoor() {
    System.out.println("2-х дверные автомобиль: " + model);
  }

  @Override
  void brake() {
    System.out.println("Торможение спортивного автомобиля: " + model);
  }
}
