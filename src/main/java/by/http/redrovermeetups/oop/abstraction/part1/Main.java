package by.http.redrovermeetups.oop.abstraction.part1;

public class Main {

  public static void main(String[] args) {
    SportCar myCar = new SportCar("Toyota", "Red", 2020);
    myCar.drive();
    myCar.openTheDoor();
    myCar.brake();
    myCar.skid();

    System.out.println(myCar.model + " " + myCar.color + " " + myCar.yearOfProduction + "\n");

    OrdinaryCar myCar1 = new OrdinaryCar("Nissan", "Blue", 2021);
    myCar1.drive();
    myCar1.openTheDoor();
    myCar1.brake();

    System.out.println(myCar1.model + " " + myCar1.color + " " + myCar1.yearOfProduction);
  }


}
