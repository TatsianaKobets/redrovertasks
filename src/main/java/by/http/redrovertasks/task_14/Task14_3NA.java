package by.http.redrovertasks.task_14;

import java.util.ArrayList;
import java.util.List;

public class Task14_3NA {

  public static void main(String[] args) {
    // Create a list to store numbers
    List<Integer> numbers = new ArrayList<>();

    // Add numbers from 100 to 1000 to the list
    for (Integer i = 100; i <= 1000; i++) {
      numbers.add(i);
    }

    // Print the list
    System.out.println(numbers);
  }
  /*
  * public static void main(String[] args) {
        // Create a list to store numbers
        List<Integer> numbers = new ArrayList<>();

        // Add numbers from 100 to 1000 to the list
        for (Integer i = 100; i <= 1000; i = new Integer(i.intValue() + 1)) {
            numbers.add(i);
        }

        // Print the list
        System.out.println(numbers);
    }*/
  /* //use the Integer.valueOf()
  *  public static void main(String[] args) {
        // Create a list to store numbers
        List<Integer> numbers = new ArrayList<>();

        // Add numbers from 100 to 1000 to the list
        for (Integer i = 100; i <= 1000; i = Integer.valueOf(i.intValue() + 1)) {
            numbers.add(i);
        }

        // Print the list
        System.out.println(numbers);
    }*/
}
