package by.http.redrovermeetups.oop.abstraction.part2;


public class Main {

  public static void main(String[] args) {

    SportCar myCar = new SportCar("Toyota", "Red", 2020, "Alex");

    myCar.drive();
    myCar.openTheDoor();
    myCar.brake();
    myCar.skid();
    System.out.println(myCar.model + " " + myCar.color + " " + myCar.yearOfProduction + " " + myCar.nameDriver);
    System.out.println(myCar.toString());
  }
}
