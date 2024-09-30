package by.http.redrovertasks.task_11;

import org.apache.commons.text.WordUtils;

public class StringAbbreviator {


  public String abbreviate(String originalString, int maxLength) {
    return WordUtils.abbreviate(originalString, 0, maxLength, "...");
  }
}
