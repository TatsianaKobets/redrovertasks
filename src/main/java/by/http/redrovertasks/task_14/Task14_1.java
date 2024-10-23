package by.http.redrovertasks.task_14;

import java.util.ArrayList;
import java.util.List;

public class Task14_1 {
  public static void main(String[] args) {
    // Create a list of colors
    List<String> colors = new ArrayList<>();
    colors.add("White");
    colors.add("Tan");
    colors.add("Yellow");
    colors.add("Orange");
    colors.add("Red");
    colors.add("Pink");
    colors.add("Purple");
    colors.add("Blue");

    // Print the original list
    System.out.println("Original list:");
    System.out.println(colors);

    // Remove colors that contain the letter "L"
    colors.removeIf(color -> color.contains("L"));

    // Print the updated list
    System.out.println("List after removing colors with 'L':");
    System.out.println(colors);
  }
}
