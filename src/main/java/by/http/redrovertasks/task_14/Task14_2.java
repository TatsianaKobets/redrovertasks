package by.http.redrovertasks.task_14;

import java.util.ArrayList;
import java.util.List;

public class Task14_2 {

  public static void main(String[] args) {
    // Create a list to store numbers
    List<Integer> numbers = new ArrayList<>();

    // Add numbers from 100 to 1000 to the list
    for (int i = 100; i <= 1000; i++) {
      numbers.add(i);
    }

    // Print the list
    System.out.println(numbers);
  }
}
  /*
  //stream
  public static void main(String[] args) {
    // Create a list with numbers from 100 to 1000
    List<Integer> numbers = IntStream.rangeClosed(100, 1000)
        .boxed()
        .collect(Collectors.toList());

    // Print the list
    System.out.println(numbers);
  }
}
*/