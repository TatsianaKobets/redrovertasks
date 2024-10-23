package by.http.redrovertasks.task_14;

import java.util.ArrayList;
import java.util.List;

public class Task14_3 {
  public static void main(String[] args) {
    // Create a list with numbers from 100 to 1000
    List<Integer> numbers = new ArrayList<>();
    for (int i = 100; i <= 1000; i++) {
      numbers.add(i);
    }

    // Print the original list
    System.out.println("Original list:");
    System.out.println(numbers);

    // Remove even elements from the list
    numbers.removeIf(n -> n % 2 == 0);

    // Print the updated list
    System.out.println("List after removing even elements:");
    System.out.println(numbers);
  }
  /*//stream
  public static void main(String[] args) {
        // Create a list with numbers from 100 to 1000
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            numbers.add(i);
        }

        // Print the original list
        System.out.println("Original list:");
        System.out.println(numbers);

        // Remove even elements from the list using stream API
        numbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Print the updated list
        System.out.println("List after removing even elements:");
        System.out.println(numbers);
    }*/
}
