package by.http.redrovertasks.task_14;

import java.util.HashMap;
import java.util.Map;

public class Task14_4 {

  public static void main(String[] args) {
    String text =
        "Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare. Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis tincidunt litora natoque per himenaeos velit. Consequat quis vestibulum ornare tortor quam pharetra. Proin ante ex habitasse consequat habitant a consequat.\n"
            +
            "\n" +
            "Suscipit quis scelerisque elementum morbi massa auctor magnis, massa habitasse. Quis libero pellentesque aenean; dolor nec potenti porttitor sem. Sagittis litora per tristique cubilia ultricies ridiculus. Urna sagittis hendrerit integer suspendisse potenti euismod suscipit phasellus lectus. Id tellus mollis id nostra nisi condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare sagittis sapien. Feugiat fusce scelerisque metus cursus aenean ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit fames eleifend varius ligula.";

    // Convert text to lowercase and split into words
    String[] words = text.toLowerCase().split("\\s+");

    // Create a map to store word frequencies
    Map<String, Integer> wordFrequencies = new HashMap<>();

    // Count word frequencies
    for (String word : words) {
      word = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation
      if (wordFrequencies.containsKey(word)) {
        wordFrequencies.put(word, wordFrequencies.get(word) + 1);
      } else {
        wordFrequencies.put(word, 1);
      }
    }

    // Find the most frequently occurring word
    String mostFrequentWord = null;
    int maxFrequency = 0;
    for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
      if (entry.getValue() > maxFrequency) {
        mostFrequentWord = entry.getKey();
        maxFrequency = entry.getValue();
      }
    }

    System.out.println("Most frequently occurring word: " + mostFrequentWord);
    System.out.println("Frequency: " + maxFrequency);
  }

}
