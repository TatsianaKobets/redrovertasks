package by.http.redrovertasks.task_11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.text.WordUtils;
import org.junit.jupiter.api.Test;

public class AbbreviateTest {

  @Test
  public void testAbbreviate() {
    StringAbbreviator abbreviator = new StringAbbreviator();
    String originalString = "Привет всем кто живет на луне!";
    String abbreviatedString10 = abbreviator.abbreviate(originalString, 10);
    String abbreviatedString20 = abbreviator.abbreviate(originalString, 20);

    assertEquals("Привет ...", abbreviatedString10);
    assertEquals("Привет всем кто ж...", abbreviatedString20);
  }
}
