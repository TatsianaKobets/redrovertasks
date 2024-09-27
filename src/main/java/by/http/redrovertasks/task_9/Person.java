package by.http.redrovertasks.task_9;

public class Person {

  private String name;
  private int age;
  private String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    if (gender.equalsIgnoreCase("male")) {
      return "Mr. " + name;
    } else if (gender.equalsIgnoreCase("female")) {
      return "Mrs. " + name;
    } else {
      return name;
    }
  }
}
